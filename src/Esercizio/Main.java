package Esercizio;

// Metodo main per testare le classi
public class Main {
    public static void main(String[] args) {
        // Creazione di diverse istanze di dipendenti
        DipendenteFullTime d1 = new DipendenteFullTime("001", 2500.0, Dipendente.PRODUZIONE);
        DipendentePartTime d2 = new DipendentePartTime("002", 0.0, Dipendente.AMMINISTRAZIONE, 80, 15.0);
        Dirigente d3 = new Dirigente("003", 3500.0, Dipendente.VENDITE, 1000.0);

        // Creazione di istanze di volontari
        Volontario v1 = new Volontario("Mario Rossi", 30, "Curriculum Vitae di Mario");
        Volontario v2 = new Volontario("Luigi Bianchi", 25, "Curriculum Vitae di Luigi");

        // Creazione di un array di dipendenti e volontari
        CheckIn[] persone = {d1, d2, d3, v1, v2};

        // Chiamata del metodo checkIn per ogni persona utilizzando il polimorfismo
        for (CheckIn persona : persone) {
            persona.checkIn();
        }
    }
}
