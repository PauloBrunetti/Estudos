package projetoanimais;

public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejar");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }
    @Override
    public void emitirsom() {
        System.out.println("Som de Réptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
