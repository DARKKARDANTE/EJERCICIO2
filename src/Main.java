import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<personaje> lisobjeto = new ArrayList<>();

        int p;
        do {

            System.out.println("1. CREAR PERSONAJE");
            System.out.println("2. MOSTRAR PERSONAJE");
            System.out.println("3. BUSCAR OBJETO");
            System.out.println("4. SALIR");
            System.out.println("Seleccione una opcion");
            p = sc.nextInt();
            switch (p){
                case 1:
                    System.out.println("1. CREAR PERSONAJE");

                    System.out.println("Elija el nombre de su personaje:");
                    String nombre = sc.next();

                    System.out.println("Elija el nivel de su personaje:");
                    int nivel = sc.nextInt();

                    System.out.println("Elija los puntos de experiencia de su personaje:");
                    int experiencia = sc.nextInt();

                    System.out.println("Elija los puntos de vida de su personaje:");
                    int vida = sc.nextInt();

                    boolean vivo = true;
                    personaje p1 = new personaje(nombre, nivel, experiencia,vida, vivo);
                    lisobjeto.add(p1);
                    break;

                case 2:
                    for (personaje u: lisobjeto){
                        System.out.println(u);
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el nombre del personaje a buscar: ");
                    String nombre1;
                    nombre1 = sc.next();

                    if (lisobjeto.isEmpty()){
                        System.out.println("la lista no tiene elementos");
                    }

                    personaje per1 = null;

                    for (personaje u : lisobjeto) {
                        if (u.getNombre().equalsIgnoreCase(nombre1)) {
                            per1 = u;
                            break;
                        }
                    }

                    if (per1 == null) {
                        System.out.println("Personaje no encontrado.");
                        break;
                    } else {
                        System.out.println(per1.toString());
                    }


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
                                System.out.println(per1.ganarExperiencia(a));
                                break;

                            case 2:
                                System.out.println("Felicidades, ha subido al nivel " + per1.subirDeNivel() + "\n\n");
                                break;

                            case 3:

                                System.out.print("¿Cuanto dano desea recibir? ");
                                int b = sc.nextInt();
                                System.out.println("Puntos de vida actuales: " + per1.recibirDano(b));
                                break;

                            case 4:
                                System.out.print("¿Cuánta vida desea recuperar? ");
                                int c = sc.nextInt();
                                System.out.println("Puntos de vida actuales : "+ per1.curarse(c));
                                break;

                            case 5:
                                per1.mostrarEstado();
                                break;

                            case 6:
                                System.out.println("Saliendo ");
                                break;

                            default:
                                System.out.println("opcion inexistente");
                        }

                    } while (op != 6);



                case 4 :
                    System.out.println("saliendo");

                default:
                    System.out.println("Elige una opcion valida");

            }



        }while (p!=4);

        sc.close();

    }
}