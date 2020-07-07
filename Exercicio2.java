public class Exercicio2 {
    public String triangulo(float x, float y, float z) {
        if (x <= 0 || y <= 0 || z <= 0)
            return "Valores inválidos";
        if (x == y && y == z)
            return "Equilátero";
        if ((x == y && y != z) || (x != y && y == z) || (x != y && x == z))
            return "Isósceles";
        if (x >= y + z)
            return "Não forma triângulo";
        if (x*x == y*y + z*z)
            return "Retângulo";
        if (x*x > y*y + z*z)
            return "Obtusângulo";
        if (x*x < y*y + z*z)
            return "Acutângulo";
        return "Sem triângulo";
    }
}
