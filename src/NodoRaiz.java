public class NodoRaiz extends NodoOperador {

    public NodoRaiz(CompositeEA izq, CompositeEA der) {
        super(izq, der);
        precedence = 2; // Ajusta la precedencia según la jerarquía de operadores
    }

    @Override
    public double evalua() {
        double r = der.evalua();
        if (r < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        } else if (izq != null) {
            throw new ArithmeticException("La raiz es una operacion unaria");
        }
        return Math.sqrt(r);
    }
}
