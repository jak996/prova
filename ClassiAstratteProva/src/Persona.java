public class Persona {
    private String nome;

    public Persona(){
        nome="ancora nessun nome";
    }
    public Persona(String nomeIniziale){
        this.nome=nomeIniziale;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void scriviOutput(){
        System.out.println("Nome: " + nome);
    }

    public boolean stessoNome(Persona altrapersona){
        if(this.nome.equalsIgnoreCase(altrapersona.nome)) return true;
        else return false;
    }
}
