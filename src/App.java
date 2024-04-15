import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la máquina expendedora de bebidas!");
        System.out.println("Elige una opción de las siguientes: ");
        System.out.println("1 - Café");
        System.out.println("2 - Mate");
        System.out.println("3 - Gaseosa");
        System.out.println("4 - Vino");

        int opción = scanner.nextInt();

        switch (opción) {
            case 1:
                System.out.println("¡Café! ¡Combina con Java!");
                break;
            case 2:
                System.out.println("¡Mate!¡Debes ser argentino o uruguayo!");
                break;
            case 3:
                System.out.println("¡Gaseosa! Es riquísima pero mala para la salud.");
                break;
            case 4:
                System.out.println("¡Vino! El vino contiene alcohol. Cuidado.");
                break;
            default:
                System.out.println("Opción no válida. Fin del programa.");
        }

        if (opción <= 4) {
            System.out.println("¡Disfrute de su bebida!");
        }

        scanner.close();
    }
}
