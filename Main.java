import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        Estudiante es = new Estudiante();
        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
        String var1;
        System.out.println("Nombre Estudiante: ");
        var1 = be.readLine();
        System.out.println("");
        es.setNombreE(var1);


        int var2;
        System.out.println("Edad: ");
        var2 = Integer.parseInt(be.readLine());
        System.out.println("");
        es.setEdad(var2);

        String var3;
        System.out.println("Matricula: ");
        var3 = be.readLine();
        System.out.println("");
        es.setMatricula(var3);

        Curso cur = new Curso();
        BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
        String codigo;
        System.out.println("Codigo curso: ");
        codigo = bc.readLine();
        System.out.println("");
        cur.setCodigo(codigo);

        String nombreCurso;
        System.out.println("Nombre curso: ");
        nombreCurso = bc.readLine();
        System.out.println("");
        cur.setNombreCurso(nombreCurso);

        int credito;
        System.out.println("Creditos curso: ");
        credito = Integer.parseInt(bc.readLine());
        System.out.println("");
        cur.setCreditos(credito);

        Profesor profe = new Profesor();
        BufferedReader bp = new BufferedReader(new InputStreamReader(System.in));
        String nombreProfe;
        System.out.println("Nombre Profesor: ");
        nombreProfe = bp.readLine();
        System.out.println("");
        profe.setNombreP(nombreProfe);

        String depar;
        System.out.println("Departamento: ");
        depar = bp.readLine();
        System.out.println("");
        profe.setDepartamento(depar);

        String mate;
        System.out.println("Materia: ");
        mate = bp.readLine();
        System.out.println("");
        profe.setMateria(mate);


        System.out.println("Nombre estudiante: " + var1);
        System.out.println("Edad: " + var2);
        System.out.println("Matricula: " + var3);
        System.out.println("Codigo curso: " + codigo);
        System.out.println("Nombre curso: " + nombreCurso);
        System.out.println("Creditos del curso: " + credito);
        System.out.println("Profesor: " + nombreProfe);
        System.out.println("Departamento: " + depar);
        System.out.println("Materia: " + mate);





    }
}