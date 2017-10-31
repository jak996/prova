public class Veicolo {
    private String nomeCasaAutomobilistica;
    private String modello;
    private Persona proprietario;

    //costruttore
    public Veicolo(String nomeCasaAutomobilistica, String modello, Persona proprietario) {
        this.nomeCasaAutomobilistica = nomeCasaAutomobilistica;
        this.modello = modello;
        this.proprietario = proprietario;
    }
    // metodi getter

    public String getNomeCasaAutomobilistica() {
        return nomeCasaAutomobilistica;
    }

    public String getModello() {
        return modello;
    }

    public Persona getProprietario() {
        return proprietario;
    }

    //metodo equals
    public boolean verificaUguaglianza(Veicolo altroVeicolo){
        if((this.nomeCasaAutomobilistica.equalsIgnoreCase(altroVeicolo.nomeCasaAutomobilistica))&&(this.modello.equalsIgnoreCase(altroVeicolo.modello))){
            return true;
        }
        else return false;
    }
}
