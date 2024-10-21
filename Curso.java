import java.util.Scanner;

public class Curso {
    private String codigo;
    private String nombreCurso;
    private int creditos;
    private String profesor;



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String detalleCurso(){
        String dC = "" + this.codigo + "\t"
                + "" + this.nombreCurso + "\t"
                + "" + this.creditos + "\t"
                + "" + this.profesor;
        return dC;
    }


}
