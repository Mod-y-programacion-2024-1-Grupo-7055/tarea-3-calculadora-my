
import java.util.StringTokenizer;



/**
 *Clase diseñada para simular una Calculadora donde el usuario puede poner el prompt que quiera.
 * @author Alejandro Hernández Mora <alejandrohmora@ciencias.unam.mx>
 */
public class Calculadora {
    static Compilador comp;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ErrorDeSintaxisException {
        String cadena = "(5-4)*3--(2/r(8-(1*4)))*c90*s90";
        comp= new Compilador();
        StringTokenizer lexemas = comp.analisisLexico(cadena);
        CompositeEA nodo = comp.arbolDeAnalisisSintactico(lexemas);
        System.out.println(nodo);
        System.out.println(nodo.evalua());
    }
}