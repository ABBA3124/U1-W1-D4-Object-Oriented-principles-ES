package Esercizio;


// Classe astratta Dipendente
public abstract class Dipendente implements CheckIn {
    // Valori possibili per il dipartimento
    public static final String PRODUZIONE = "PRODUZIONE";
    public static final String AMMINISTRAZIONE = "AMMINISTRAZIONE";
    public static final String VENDITE = "VENDITE";
    // Attributi privati
    private String matricola;
    private double stipendio;
    private String dipartimento;

    // Costruttore
    public Dipendente(String matricola, double stipendio, String dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    // Metodi getter per leggere le proprietà
    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    // Metodo setter per modificare il dipartimento
    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    // Metodo astratto per calcolare lo stipendio
    public abstract double calculateSalary();

    // Implementazione del metodo checkIn dall'interfaccia CheckIn
    @Override
    public void checkIn() {
        System.out.println("Dipendente " + matricola + " ha iniziato il turno di lavoro.");
    }
}

