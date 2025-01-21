package Api;

import Model.Mascota;
import java.util.Scanner;

public class Api {

    /**
     *
     * @param msg el mensaje principal con el que le pides el dato
     * @param error el mensaje en el caso que salga error
     * @return return del nombre lleno, para que nunca este vacio.
     */
    public static String noEnter(String msg, String error) {
        String nombre;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println(msg);
            nombre = input.nextLine();
            if (nombre.isEmpty()) {
                System.out.println(error);
            }
        } while (nombre.isEmpty());
        return nombre;
    }

    /**
     *
     * @param mayor el numero que deseas que sea mayor
     * @return devuelves el numero que sea mayor que la variable mayor
     */
    public static double Doublemayor(double mayor) {
        Scanner input = new Scanner(System.in);
        double numero;
        while (true) {
            System.out.println("Inserta un numero decimal mayor a " + mayor);
            try {
                numero = input.nextDouble();
                if (numero > mayor) {
                    return numero;
                }
            } catch (NumberFormatException e) {
                input.nextLine();
            }
        }
    }

    /**
     *
     * @param mayor numero que deseas que sea mayor
     * @return devuelve el numero que sea mayor que la variable mayor
     */
    public static int Intmayor(int mayor) {
        Scanner input = new Scanner(System.in);
        int numero;
        while (true) {
            System.out.println("Inserta el numero");
            try {
                numero = Integer.parseInt(input.nextLine());
                if (numero > mayor) {
                    return numero;
                }
            } catch (NumberFormatException e) {
                input.nextLine();
            }
        }
    }

    /**
     *
     * @param min numero minimo
     * @param max numero maximo
     * @param msg mensaje con el que le pides el numero
     * @return return del numero entre el minimo y maximo
     */
    public static int askForIntBetween(int min, int max, String msg) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.println(msg);
            try {
                number = input.nextInt();
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.out.println("Porfavor, inserta un numero entre " + min + " y " + max);
                }
            } catch (Exception e) {
                System.out.println("Porfavor, inserta un numero entero " + min + " y " + max);
                input.nextLine();
            }
        } while (true);
    }

    /**
     *
     * @param text para hacer print de cualquier menu que le pases por el metodo
     */
    public static void menu(String... text) {
        for (String t : text) {
            System.out.println(t);
        }

    }

    /**
     *
     * @param exit para salir de algun bucle o aplicacion
     * @return returnea true
     */
    public static boolean salir(boolean exit) {
        System.out.println("Saliendo...");
        return true;
    }

    /**
     *
     * @param edad le pasas un entero, en este caso edad
     * @param msg el mensaje para indicarle que si quiere cambiar la edad
     * @return return edad con el valor asignado o con -1 en el caso de que no
     * quiera asignar nada
     */
    public static int sn(int edad, String msg) {
        Scanner input = new Scanner(System.in);
        String sn = sn(msg);
        if (sn.equals("S")) {
            do {
                System.out.println("Inserta la edad (0 o mayor):");
                edad = input.nextInt();
                if (edad < 0) {
                    System.out.println("La edad no puede ser negativa. Por favor, intenta de nuevo.");
                } else {
                    return edad;
                }
            } while (edad < 0);
        }
        return -1;

    }

    /**
     *
     * @param peso le pasas un double, peso
     * @param msg el mensaje para indicarle que si quiere cambiar el peso
     * @return return de peso con el valor o -1 si no quiere asignar nada
     */
    public static double sn(double peso, String msg) {
        Scanner input = new Scanner(System.in);
        String sn = sn(msg);
        if (sn.equals("S")) {
            do {
                System.out.println("Inserta el peso (0 o mayor):");
                peso = input.nextDouble();
                if (peso < 0) {
                    System.out.println("El peso no puede ser negativo. Por favor, intenta de nuevo.");
                } else {
                    return peso;
                }
            } while (peso < 0);
        }
        return -1.0;

    }

    /**
     *
     * @param msg el mensaje para si quiere hacer algo o no
     * @return return 's' o 'n'
     */
    public static String sn(String msg) {
        String sn;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println(msg + " S/N");
            sn = input.nextLine().toUpperCase();
            if (!sn.equals("S") && !sn.equals("N")) {
                System.out.println("Entrada no valida. Por favor, escribe S o N.");
            }
        } while (!sn.equals("S") && !sn.equals("N"));

        return sn;
    }

}
