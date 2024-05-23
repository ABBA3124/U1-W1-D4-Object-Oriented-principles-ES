package Esercizio;

// Classe Dirigente
public class Dirigente extends Dipendente {
    private double bonus;

    public Dirigente(String matricola, double stipendio, String dipartimento, double bonus) {
        super(matricola, stipendio, dipartimento);
        this.bonus = bonus;
    }

    // Implementazione del metodo calculateSalary per Dirigente
    @Override
    public double calculateSalary() {
        return getStipendio() + bonus;
    }
}