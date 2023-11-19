public class NodoSeno extends NodoOperador {

    public NodoSeno(CompositeEA izq, CompositeEA der) {
        super(izq, der);
        precedence = 2; // Ajusta la precedencia según la jerarquía de operadores
    }

    @Override
    public double evalua() {
        if (izq != null) {
            throw new ArithmeticException("El seno es una operacion unaria");
        }
        return Math.sin(der.evalua());
    }
}
