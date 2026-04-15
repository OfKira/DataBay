package logica;

import modelo.Contenedor;

// Este módulo maneja el manifiesto usando un arreglo de objetos.
// El arreglo sirve para registrar los contenedores que llegan al puerto.
public class ModuloManifiesto {
    private Contenedor[] manifiesto;

    public ModuloManifiesto(int tamanio) {
        manifiesto = new Contenedor[tamanio];
    }

    public boolean agregarContenedor(Contenedor c) {
        for (int i = 0; i < manifiesto.length; i++) {
            if (manifiesto[i] == null) {
                manifiesto[i] = c;
                return true;
            }
        }
        return false;
    }

    public double sumarPesos() {
        double suma = 0;
        for (int i = 0; i < manifiesto.length; i++) {
            if (manifiesto[i] != null) {
                suma += manifiesto[i].getPeso();
            }
        }
        return suma;
    }

    public Contenedor[] getManifiesto() {
        return manifiesto;
    }

    public void mostrarManifiesto() {
        for (int i = 0; i < manifiesto.length; i++) {
            System.out.println("Posicion " + i + ": " + manifiesto[i]);
        }
    }
}