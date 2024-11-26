import java.util.Scanner;
public class ControlFlujo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.println("Ingrese un número del 1 al 100: ");
            numero = scanner.nextInt();

            if (numero >= 1 && numero <= 100) {
                break;
            } else {
                System.out.println("Error. El número debe estar entre 1 y 100.");
            }
        }

        int pares = 0;
        int impares = 0;

        for(int i = 1; i <= numero; i++){
            if(i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("El total de numeros pares son: " + pares);
        System.out.println("El total de numeros impares son: " + impares);
        System.out.println("Fin del programa");
    }
}
