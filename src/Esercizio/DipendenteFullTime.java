package Esercizio;

// Classe DipendenteFullTime
public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String matricola, double stipendio, String dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    // Implementazione del metodo calculateSalary per DipendenteFullTime
    @Override
    public double calculateSalary() {
        return getStipendio();
    }
}