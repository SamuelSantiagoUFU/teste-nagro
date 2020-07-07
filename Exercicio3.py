alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
def krypto(frase):
    frase = frase.upper()
    novaFrase = ""
    tamanhoAlfabeto = len(alfabeto)
    for i in range(len(frase)):
        letra = frase[i]
        try:
            posLetra = alfabeto.index(letra)
            if (posLetra + 18 > tamanhoAlfabeto - 1):
                diff = tamanhoAlfabeto - posLetra
                novaFrase += alfabeto[tamanhoAlfabeto - 18 - diff]
            else:
                novaFrase += alfabeto[posLetra + 18]
        except:
            novaFrase += letra
    return novaFrase
print(krypto("4S90S U64796C JN 3S9S51SA 5S XW09S"))
