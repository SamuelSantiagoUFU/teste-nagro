def triangulo(x, y, z):
    if (x <= 0 or y <= 0 or z <= 0):
        return "Valores inválidos"
    if (x == y and y == z):
        return "Equilátero"
    if ((x == y and y != z) or (x != y and y == z) or (x != y and x == z)):
        return "Isósceles"
    if (x >= y + z):
        return "Não forma triângulo"
    if (x*x == y*y + z*z):
        return "Retângulo"
    if (x*x > y*y + z*z):
        return "Obtusângulo"
    if (x*x < y*y + z*z):
        return "Acutângulo"
    return "Sem triângulo"
print(triangulo(20,15,8))
