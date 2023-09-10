import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        String numeroRomano;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un número entre 1-3000");
        numero = leer.nextInt();

        if (numero < 1 || numero > 3000) {
            System.out.println("El número debe estar entre 1 y 3000");
        }else{
            numeroRomano = convertirARomano(numero);
        System.out.println(numero + " es en números romanos:"+ numeroRomano);
        }

    }
