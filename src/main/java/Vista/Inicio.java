package Vista;

import static Api.Api.*;
import static Controlador.ControladorEntidad.*;

public class Inicio {

    /**
     *
     * @param args MAIN, menu con
     */
    public static void main(String[] args) {
        boolean exit = false;
        int nummenu;
        do {
            menu("==========================",
                    "==         MENU         ==",
                    "== 1. Crear mascota     ==",
                    "== 2. Buscar mascota    ==",
                    "== 3. Modificar mascota ==",
                    "== 4. Borrar mascota    ==",
                    "== 5. Salir             ==",
                    "==========================",
                    "");
            nummenu = askForIntBetween(1, 5, "Selecciona una opcion...");
            switch (nummenu) {
                case 1 -> {
                    crearEntidad();
                }
                case 2 -> {
                    buscarEntidad();
                }
                case 3 -> {
                    modEntidad();
                }
                case 4 -> {
                    borrarEntidad();
                }
                case 5 -> {
                    exit = salir(exit);
                }
            }
        } while (!exit);
    }
}
