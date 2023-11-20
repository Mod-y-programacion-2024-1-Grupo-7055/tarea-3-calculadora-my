public class NodoTangente extends NodoOperador {

    public NodoTangente(CompositeEA izq, CompositeEA der) {
        super(izq, der);
        precedence = 3; // Ajusta la precedencia según la jerarquía de operadores
    }

    @Override
    public double evalua() {
        if (izq != null) {
            throw new ArithmeticException("La tangente es una operacion unaria");
        }
        return Math.tan(der.evalua());
    }
}
