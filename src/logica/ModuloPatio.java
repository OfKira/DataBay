package logica;

import modelo.Contenedor;

// Este módulo usa una matriz para representar el patio del puerto.
// Se recorre por filas y columnas para ubicar el contenedor en la primera posición null.
public class ModuloPatio {
    private Contenedor[][] patio;

    public ModuloPatio(int filas, int columnas) {
        patio = new Contenedor[filas][columnas];
    }

    public boolean ubicarContenedor(Contenedor c) {
        for (int i = 0; i < patio.length; i++) {
            for (int j = 0; j < patio[i].length; j++) {
                if (patio[i][j] == null) {
                    patio[i][j] = c;
                    return true;
                }
            }
        }
        return false;
    }

    public void mostrarPatio() {
        for (int i = 0; i < patio.length; i++) {
            for (int j = 0; j < patio[i].length; j++) {
                System.out.print((patio[i][j] == null ? "[VACIO]" : "[" + patio[i][j].getId() + "]") + " ");
            }
            System.out.println();
        }
    }

    public Contenedor[][] getPatio() {
        return patio;
    }
}