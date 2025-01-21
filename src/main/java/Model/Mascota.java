package Model;

public class Mascota {

    private final int id; // Obligatorio
    private String nombre; // Obligatorio
    private String especie; // Obligatorio
    private int edad; // Opcional
    private double peso; // Opcional

    private static int contadorMascotas = 1;

    public Mascota(String nombre, String especie) {
        id = contadorMascotas;
        this.nombre = nombre;
        this.especie = especie;
        contadorMascotas++;
    }

    public Mascota(String nombre, String especie, int edad) {
        id = contadorMascotas;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        contadorMascotas++;
    }

    public Mascota(String nombre, String especie, double peso) {
        id = contadorMascotas;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        contadorMascotas++;
    }

    public Mascota(String nombre, String especie, int edad, double peso) {
        id = contadorMascotas;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        contadorMascotas++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public static int getContadorMascotas() {
        return contadorMascotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 2;
    }

    public double pesoPromedio() {
        if (edad == 0) {
            return this.peso;
        }
        return this.peso / this.edad;
    }
}
