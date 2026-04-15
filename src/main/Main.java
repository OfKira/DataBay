package main;

import logica.ModuloBuque;
import logica.ModuloInspeccion;
import logica.ModuloManifiesto;
import logica.ModuloPatio;
import modelo.Contenedor;

public class Main {
    public static void main(String[] args) {
        // Datos quemados para probar el sistema sin teclado.
        Contenedor[] prueba = new Contenedor[] {
            new Contenedor("DAB-001", 12.5, 2),
            new Contenedor("DAB-002", 18.0, 5),
            new Contenedor("DAB-003", 9.75, 1),
            new Contenedor("DAB-004", 22.3, 4),
            new Contenedor("DAB-005", 15.0, 3),
            new Contenedor("DAB-006", 28.4, 5)
        };

        ModuloManifiesto manifiesto = new ModuloManifiesto(10);
        ModuloPatio patio = new ModuloPatio(3, 3);
        ModuloInspeccion inspeccion = new ModuloInspeccion();
        ModuloBuque buque = new ModuloBuque();

        System.out.println("=== MODULO 1: MANIFIESTO ===");
        for (int i = 0; i < prueba.length; i++) {
            boolean ok = manifiesto.agregarContenedor(prueba[i]);
            System.out.println((ok ? "Agregado: " : "No se pudo agregar: ") + prueba[i]);
        }
        manifiesto.mostrarManifiesto();
        System.out.println("Peso total del manifiesto: " + manifiesto.sumarPesos());

        System.out.println("\n=== MODULO 2: PATIO ===");
        Contenedor[] arrManifiesto = manifiesto.getManifiesto();
        for (int i = 0; i < arrManifiesto.length; i++) {
            if (arrManifiesto[i] != null) {
                boolean ok = patio.ubicarContenedor(arrManifiesto[i]);
                System.out.println((ok ? "Ubicado en patio: " : "Puerto saturado para: ") + arrManifiesto[i].getId());
            }
        }
        patio.mostrarPatio();

        System.out.println("\n=== MODULO 3: INSPECCION ===");
        for (int i = 0; i < arrManifiesto.length; i++) {
            if (arrManifiesto[i] != null) {
                if (arrManifiesto[i].getPrioridad() >= 4) {
                    inspeccion.encolar(arrManifiesto[i]);
                    System.out.println("Enviado a inspeccion: " + arrManifiesto[i]);
                }
            }
        }
        inspeccion.mostrarCola();
        while (!inspeccion.estaVacia()) {
            Contenedor revisado = inspeccion.desencolar();
            System.out.println("Sale de inspeccion: " + revisado);
            buque.apilar(revisado);
        }

        System.out.println("\n=== MODULO 4: BUQUE ===");
        for (int i = 0; i < arrManifiesto.length; i++) {
            if (arrManifiesto[i] != null && arrManifiesto[i].getPrioridad() < 4) {
                buque.apilar(arrManifiesto[i]);
                System.out.println("Cargado al buque: " + arrManifiesto[i]);
            }
        }
        buque.mostrarBuque();

        Contenedor retirado = buque.retirarDelFondo();
        System.out.println("\nContenedor retirado del fondo con pila auxiliar: " + retirado);
        buque.mostrarBuque();
    }
}