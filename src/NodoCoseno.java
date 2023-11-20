public class NodoCoseno extends NodoOperador {

    public NodoCoseno(CompositeEA izq, CompositeEA der) {
        super(izq, der);
        precedence = 3; // Ajusta la precedencia según la jerarquía de operadores
    }

    @Override
    public double evalua() {
        if (izq != null) {
            throw new ArithmeticException("El seno es una operacion unaria");
        }
        return Math.cos(der.evalua());
    }
}
