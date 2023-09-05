package co.edu.uniquindio.universidad;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = crearEstudiante("Juan", 17, "juan@mail.com", 3, 3.0, 3.5, 4.5);
        Estudiante estudiante2 = crearEstudiante("María", 15, "pepita@mail.com", 1, 2.0, 2.5, 4.5);
        Estudiante estudiante3 = crearEstudiante("pepe", 20, "pepe@mail.com", 4, 4.0, 2.5, 4.5);
        Docente docente1 = crearDocente("Oscar", 40, "Oscar@mail.com");
        Curso curso = crearCurso("Programación 1", 2, "02N", 3, "Nocturno", estudiante1, estudiante2, estudiante3, docente1);


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
        return docente;

    }

    public static Curso crearCurso (String nombre, int semestre, String grupo, int creditos, String jornada, Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3, Docente docente1){
        Curso curso = new Curso();
        curso.setNombre(nombre);
        curso.setSemestre(semestre);
        curso.setGrupo(grupo);
        curso.setCreditos(creditos);
        curso.setJornada(jornada);
        curso.setEstudiante1(estudiante1);
        curso.setEstudiante2(estudiante2);
        curso.setEstudiante3(estudiante3);
        curso.setDocente1(docente1);
        return curso;
    }

}