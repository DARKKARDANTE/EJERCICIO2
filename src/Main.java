import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        personaje p1 = new personaje("Darkar", 0, 0, 100, true);

        p1.mostrarEstado();

        System.out.println(p1.ganarExperiencia(5) + "\n\n");
        System.out.println("Felicidades, ha subido de nivel " + p1.subirDeNivel() + "\n\n");
        System.out.println(p1.recibirDano(10) + "\n\n");
        System.out.println(p1.curarse(10) + "\n\n");

        p1.mostrarEstado();
        int op;

        do {

            System.out.println("\nMENU DE OPCIONES");
            System.out.println("1. GANAR EXPERIENCIA");
            System.out.println("2. SUBIR DE NIVEL");
            System.out.println("3. RECIBIR DANO");
            System.out.println("4. CURAR");
            System.out.println("5. MOSTRAR ESTADO");
            System.out.println("6. SALIR");

            System.out.print("Elija una opcion: ");
            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.print("¿Cuánta experiencia desea ganar? ");
                    int a = sc.nextInt();
                    System.out.println(p1.ganarExperiencia(a));
                    break;

                case 2:
                    System.out.println("Felicidades, ha subido al nivel " + p1.subirDeNivel() + "\n\n");
                    break;

                case 3:

                    System.out.print("¿Cuanto dano desea recibir? ");
                    int b = sc.nextInt();
                    System.out.println("Puntos de vida actuales: " + p1.recibirDano(b));
                    break;

                case 4:
                    System.out.print("¿Cuánta vida desea recuperar? ");
                    int c = sc.nextInt();
                    System.out.println("Puntos de vida actuales : "+ p1.curarse(c));
                    break;

                case 5:
                    p1.mostrarEstado();
                    break;

                case 0:
                    System.out.println("Saliendo ");
                    break;

                default:
                    System.out.println("opcion inexistente");
            }

        } while (op != 0);

        sc.close();
    }
}