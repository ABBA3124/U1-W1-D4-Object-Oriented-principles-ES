package Esercizio;

// Classe DipendentePartTime
public class DipendentePartTime extends Dipendente {
    private int oreLavorate;
    private double pagaOraria;

    public DipendentePartTime(String matricola, double stipendio, String dipartimento, int oreLavorate, double pagaOraria) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
        this.pagaOraria = pagaOraria;
    }

    // Implementazione del metodo calculateSalary per DipendentePartTime
    @Override
    public double calculateSalary() {
        return oreLavorate * pagaOraria;
    }
}
