package Practica2.dominio;

import java.util.Arrays;

public class Tablero {
    private static int DIMENSION = 30;
    private int[][] estadoActual;
    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];

    public void leerEstadoActual(){
        estadoActual = new int[DIMENSION][DIMENSION];
        for(int i = 0; i < DIMENSION; i++){
            for(int j = 0; j < DIMENSION; j++){
                estadoActual[i][j] = (Math.random() < 0.5) ? 1 : 0;
            }
        }
    }

    public void generarEstadoActualPorMontecarlo(){
        estadoActual = new int[DIMENSION][DIMENSION];
        for(int i = 0; i < DIMENSION; i++){
            for(int j = 0; j < DIMENSION; j++){

            }
        }

    }

    public void transitarAlEstadoSiguiente(){


    }

    @Override
    public String toString() {
        return "";
    }
}
