package mates;
import java.util.Scanner;
public class Matematicas {
    public static double generarNumPIMontecarlo(long pasos){
        Scanner sc = new Scanner(System.in);

        int aciertos = 0;
        double areaCuadrado = 4;
        for(int i = 0; i< pasos; i++){
            double x = Math.random();
            double y = Math.random();
            if(Math.pow(x, 2) + Math.pow(y, 2) <= 1){
                aciertos++;
            }
        }
        double pi = (aciertos * areaCuadrado) / pasos;
        return pi;
    }
}
