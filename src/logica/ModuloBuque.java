package logica;

import java.util.Stack;
import modelo.Contenedor;

// Este módulo usa una pila LIFO.
// LIFO significa Last In, First Out: el último en entrar es el primero en salir.
// También usa una pila auxiliar para sacar un contenedor del fondo y luego reconstruir la pila.
public class ModuloBuque {
    private Stack<Contenedor> buque;

    public ModuloBuque() {
        buque = new Stack<>();
    }

    public void apilar(Contenedor c) {
        buque.push(c);
    }

    public Contenedor desapilar() {
        if (buque.isEmpty()) {
            return null;
        }
        return buque.pop();
    }

    public boolean estaVacia() {
        return buque.isEmpty();
    }

    public void mostrarBuque() {
        System.out.println("Contenedores en el buque (de fondo a tope):");
        for (int i = 0; i < buque.size(); i++) {
            System.out.println("Nivel " + i + ": " + buque.get(i));
        }
    }

    public Contenedor retirarDelFondo() {
        if (buque.isEmpty()) {
            return null;
        }
        Stack<Contenedor> auxiliar = new Stack<>();
        while (buque.size() > 1) {
            auxiliar.push(buque.pop());
        }
        Contenedor fondo = buque.pop();
        while (!auxiliar.isEmpty()) {
            buque.push(auxiliar.pop());
        }
        return fondo;
    }
}