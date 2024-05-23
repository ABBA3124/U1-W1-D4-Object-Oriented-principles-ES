package Esercizio;

// Classe Volontario
public class Volontario implements CheckIn {
    private String nome;
    private int eta;
    private String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    // Implementazione del metodo checkIn dall'interfaccia CheckIn
    @Override
    public void checkIn() {
        System.out.println("Volontario " + nome + " ha iniziato il servizio.");
    }

    // Getter per nome
    public String getNome() {
        return nome;
    }

    // Getter per età
    public int getEta() {
        return eta;
    }

    // Getter per cv
    public String getCv() {
        return cv;
    }
}