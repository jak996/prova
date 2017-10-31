public class Camion extends Veicolo {
    private double capacitaDiCaricoInTonnellate;
    private double capacitaDelRimorchio;

    public Camion(double capacitaDiCaricoInTonnellate, double capacitaDelRimorchio,String nomeCasaAutomobilistica, String modello, Persona proprietario){
        super(nomeCasaAutomobilistica,modello,proprietario);
        this.capacitaDiCaricoInTonnellate=capacitaDiCaricoInTonnellate;
        this.capacitaDelRimorchio=capacitaDelRimorchio;
    }

    //metodi getter

    public double getCapacitaDiCaricoInTonnellate() {
        return capacitaDiCaricoInTonnellate;
    }

    public double getCapacitaDelRimorchio() {
        return capacitaDelRimorchio;
    }

    // metodo equals

    public boolean verificaUguaglianza(Veicolo altroCamion){
        if(altroCamion instanceof Camion) {
            Camion castedCamion = (Camion) altroCamion;
            if ((super.verificaUguaglianza(altroCamion) && (this.capacitaDiCaricoInTonnellate == castedCamion.capacitaDiCaricoInTonnellate) && (this.capacitaDelRimorchio == castedCamion.capacitaDelRimorchio))) {
                return true;
            }
            else return false;
        }
    }
}
