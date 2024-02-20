class Estudiante {
    String nombre;
    int edad;

    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class Student{
    public static void main(String[] args) {
        // Creación de un array de objetos de la clase Estudiante
        Estudiante[] estudiantes = new Estudiante[3];
        estudiantes[0] = new Estudiante("Juan", 20);
        estudiantes[1] = new Estudiante("Ana", 22);
        estudiantes[2] = new Estudiante("Luis", 19);

        System.out.println("Información de los estudiantes:");

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            System.out.println("Nombre: " + estudiantes[i].nombre);
            System.out.println("Edad: " + estudiantes[i].edad);
            System.out.println("---------------------------");
        }
    }
}
