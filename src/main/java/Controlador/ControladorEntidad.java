package Controlador;

import static Api.Api.*;
import Model.Mascota;
import java.util.ArrayList;

public class ControladorEntidad {

    /**
     * crear arraylist para guardar los datos de las mascotas con direcciones
     */
    private static final ArrayList<Mascota> listaMascotas = new ArrayList<>();

    /**
     *
     * @param id el id que buscar con un bucle dentro de todas las mascotas
     * guardadas
     * @return returnea la direccion de la mascota
     */
    public static Mascota getMascotaByID(int id) {
        for (Mascota n : listaMascotas) {
            if (n.getId() == id) {
                return n;
            }
        }
        return null;
    }

    /**
     * creas la entidad con el uso tambien de otros metodos para verificar que
     * los valores son correctos
     */
    public static void crearEntidad() {
        String nombre = noEnter("Inserta el nombre de la mascota:", "No lo dejes vacio.");
        String especie = noEnter("Inserta la especie de la mascota:", "No lo dejes vacio");
        Mascota nueva = new Mascota(nombre, especie);
        int edad = -1;
        edad = sn(edad, "Deseas introducir la edad?");
        if (edad != -1) {
            nueva.setEdad(edad);
        }

        double peso = -1.0;
        peso = sn(peso, "Deseas introducir el peso?");
        if (peso != -1.0) {
            nueva.setEdad(edad);
        }

        listaMascotas.add(nueva);
        System.out.println("La mascota se ha creado y guardado correctamente.");
        printMascota(nueva.getId());
    }

    /**
     * buscas la entidad indicandole el id
     */
    public static void buscarEntidad() {
        if (listaMascotas.isEmpty()) {
            System.out.println("No hay ninguna mascota almacenada");
            return;
        }
        int id = askForIntBetween(1, listaMascotas.size(), "Inserta el ID de la mascota: ");
        printMascota(id);
    }

    /**
     * modificas la entidad dependiendo de la id y la opcion que escojas
     */
    public static void modEntidad() {
        if (listaMascotas.isEmpty()) {
            System.out.println("No hay ninguna mascota almazenada");
            return;
        }
        int id = askForIntBetween(1, listaMascotas.size(), "Inserta el ID de la mascota: ");
        menu("""
             ===========================
             ==          MENU         ==
             == 1. Modificar nombre   ==
             == 2. Modificar especie  ==
             == 3. Modificar peso     ==
             == 4. Modificar edad     ==
             ===========================""");
        int nummenu = askForIntBetween(1, 4, "Selecciona una opcion...");
        switch (nummenu) {
            case 1 -> {
                getMascotaByID(id).setNombre(noEnter("Inserta el nuevo nombre de la mascota", "Error, no dejes el nombre vacio"));
            }
            case 2 -> {
                getMascotaByID(id).setNombre(noEnter("Inserta la nueva especie de la mascota", "Error, no dejes la especie vacia"));
            }
            case 3 -> {
                getMascotaByID(id).setPeso(Doublemayor(0.1));
            }
            case 4 -> {
                getMascotaByID(id).setEdad(Intmayor(1));
            }
        }

    }

    /**
     * borras la entidad idicandole la id, y te da un mensaje de advertencia
     */
    public static void borrarEntidad() {
        if (listaMascotas.isEmpty()) {
            System.out.println("No hay ninguna mascota almazenada");
            return;
        } else {
            int id = askForIntBetween(1, listaMascotas.size(), "Inserta el ID de la mascota: ");
            String sn = sn("Seguro que quieres eliminar la mascota?");

            if (sn.equals("S")) {
                listaMascotas.remove(getMascotaByID(id));
            } else {
                System.out.println("Operacion cancelada");
            }
        }
    }

    /**
     *
     * @param id printea los valores de la mascota
     */
    public static void printMascota(int id) {
        Mascota toPrint = getMascotaByID(id);
        System.out.println("ID: " + toPrint.getId() + ".");
        System.out.println("nombre: " + toPrint.getNombre() + ".");
        System.out.println("especie: " + toPrint.getEspecie() + ".");
        if (toPrint.getEdad() != 0) {
            System.out.println("edad: " + toPrint.getEdad() + ".");
        }
        if (toPrint.getPeso() != 0.0) {
            System.out.println("peso: " + toPrint.getPeso() + ".");
        }

    }

}
