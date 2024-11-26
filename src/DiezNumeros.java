import java.util.Scanner;
public class DiezNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el " + ordinal(i) + " número: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        System.out.println("El número de ceros introducidos es de: " + ceros);
        System.out.println("El número de positivos introducidos es de: " + positivos);
        System.out.println("El número de negativos introducidos es de: " + negativos);
    }
    private static String ordinal(int num) {
        switch (num) {
            case 1:
                return "primer";
            case 2:
                return "segundo";
            case 3:
                return "tercero";
            case 4:
                return "cuarto";
            case 5:
                return "quinto";
            case 6:
                return "sexto";
            case 7:
                return "septimo";
            case 8:
                return "octavo";
            case 9:
                return "noveno";
            case 10:
                return "decimo";
            default:
                return "";
        }
    }
}
