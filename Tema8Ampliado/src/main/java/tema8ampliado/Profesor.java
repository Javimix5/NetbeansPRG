package tema8ampliado;

/**
 *
 * @author Javier González Prados
 */
public class Profesor extends Persona {

    private int numeroCursos;
    private String nombresCursos;

    public Profesor(String nombre, String direccion) {
        super(nombre, direccion);
        this.numeroCursos = 0;
        this.nombresCursos = "";
    }

    public void imparteCurso(String curso) {
        numeroCursos++;
        if (nombresCursos.isEmpty()) {
            nombresCursos = curso;
        } else {
            nombresCursos += ", " + curso;
        }
    }

    public void eliminaCurso(String curso) {
        if (numeroCursos > 0) {
            numeroCursos--;
            nombresCursos = nombresCursos.replace(curso, "").replace(", ,", ",");
            if (nombresCursos.startsWith(", ")) {
                nombresCursos = nombresCursos.substring(2);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nCursos: " + nombresCursos + "\nTotal de cursos: " + numeroCursos;
    }
}
