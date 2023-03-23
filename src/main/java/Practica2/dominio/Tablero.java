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
        for(int i = 0; i< DIMENSION; i++){
            for(int j = 0; j<DIMENSION; j++){
                System.out.print(estadoActual[i][j]);
            }
            System.out.println();
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
        for(int i = 0; i < DIMENSION; i++){
            for(int j = 0; j < DIMENSION; j++){

            }
        }


    }

    @Override
    public String toString() {
        String tablero = "";
        for(int i = 0; i< DIMENSION; i++){
            for(int j = 0; j<DIMENSION; j++){
                tablero += estadoActual[i][j];
            }
        }
        return tablero;
    }
}
