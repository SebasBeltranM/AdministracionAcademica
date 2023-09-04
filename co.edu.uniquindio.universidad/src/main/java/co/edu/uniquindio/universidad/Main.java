package co.edu.uniquindio.universidad;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = crearEstudiante("Juan", 17, "juan@mail.com", 3, 3.0, 3.5, 4.5);
        Estudiante estudiante2 = crearEstudiante("María", 15, "pepita@mail.com", 1, 2.0, 2.5, 4.5);
        Estudiante estudiante3 = crearEstudiante("pepe", 20, "pepe@mail.com", 4, 4.0, 2.5, 4.5);
        Docente docente1 = crearDocente("Oscar", 40, "Oscar@mail.com");



    }

    public static Estudiante crearEstudiante (String nombre, int edad, String correo, int semestre, double nota1,
                                              double nota2, double nota3){
            Estudiante estudiante = new Estudiante();
            estudiante.setNombre(nombre);
            estudiante.setEdad(edad);
            estudiante.setCorreo(correo);
            estudiante.setSemestre(semestre);
            estudiante.setNota1(nota1);
            estudiante.setNota2(nota2);
            estudiante.setNota3(nota3);
            return estudiante;
    }

    public static Docente crearDocente (String nombre, int edad, String correo){
        Docente docente = new Docente();
        docente.setNombre(nombre);
        docente.setEdad(edad);
        docente.setCorreo(correo);

    }
}