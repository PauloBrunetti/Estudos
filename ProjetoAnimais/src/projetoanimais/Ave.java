package projetoanimais;

public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }
    @Override
    public void emitirsom() {
        System.out.println("Som de Ave");
    }
    public void fazerNinho(){
        System.out.println("Fazer ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
