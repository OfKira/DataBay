package logica;

import java.util.LinkedList;
import java.util.Queue;
import modelo.Contenedor;

// Este módulo usa una cola FIFO.
// FIFO significa First In, First Out: el primero en entrar es el primero en salir.
public class ModuloInspeccion{
    private Queue<Contenedor> cola;

    public ModuloInspeccion() {
        cola = new LinkedList<>();
    }

    public void encolar(Contenedor c) {
        cola.add(c);
    }

    public Contenedor desencolar() {
        return cola.poll();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public void mostrarCola() {
        System.out.println("Contenedores en inspeccion:");
        for (Contenedor c : cola) {
            System.out.println(c);
        }
    }
}