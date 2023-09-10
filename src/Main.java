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
    public static String convertirARomano(int numero) {
        String[] unidades = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] decenas = {" ", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] centenas = {" ", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] millares = {" ", "M", "MM", "MMM"};
        int indexmil, indexcen, indexdec, indexuni;
        indexmil = numero / 1000;
        numero = numero % 1000;
        indexcen = numero / 100;
        numero = numero % 100;
        indexdec = numero / 10;
        numero = numero % 10;
        indexuni = numero;

        return millares[indexmil] + centenas[indexcen] + decenas[indexdec] + unidades[indexuni];

    }
}