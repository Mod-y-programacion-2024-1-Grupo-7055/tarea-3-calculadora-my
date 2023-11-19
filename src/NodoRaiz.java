public class NodoRaiz extends NodoOperador {

    public NodoRaiz(CompositeEA izq, CompositeEA der) {
        super(izq, der);
        precedence = 3; // Ajusta la precedencia según la jerarquía de operadores
    }

    @Override
    public double evalua() {
        double r = der.evalua();
        if (r < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(der.evalua());
    }
}
