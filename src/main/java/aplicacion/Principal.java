package aplicacion;
import mates.Matematicas;
public class Principal {
    public static void main(String[] args) {
        Matematicas matematicas = new Matematicas();
        System.out.println("El número PI es: " + Matematicas.generarNumPIMontecarlo(10));

    }
}
