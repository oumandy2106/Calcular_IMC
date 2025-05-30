import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su altura:");
        double altura = sc.nextDouble();
        System.out.println("Ingrese su peso:");
        double peso = sc.nextDouble();

        persona usuario = new persona(nombre, peso, altura);

        double imc = usuario.calcularIMC();
        String devolver = usuario.devolverIMC();
        System.out.println(devolver);

    }
}