public class Exercicio3 {
    private final String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public String krypto(String frase) {
        frase = frase.toUpperCase();
        String novaFrase = "";
        for (int i = 0; i < frase.length(); i++) {
            char letraFrase = frase.charAt(i);
            int letra = this.alfabeto.indexOf(letraFrase);
            if (letra == -1) {
                novaFrase += letraFrase;
                continue;
            }
            if (letra + 18 > this.alfabeto.length() - 1) {
                int diff = this.alfabeto.length() - letra;
                novaFrase += this.alfabeto.charAt(this.alfabeto.length() - 18 - diff);
            } else {
                novaFrase += this.alfabeto.charAt(letra + 18);
            }
        }
        return novaFrase;
    }
}
