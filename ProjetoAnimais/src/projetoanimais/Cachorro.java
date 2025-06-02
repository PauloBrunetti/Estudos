package projetoanimais;

public class Cachorro extends Mamifero{
    
    @Override
    public void alimentar(){
        System.out.println("Comer ração");
    }
    @Override
    public void locomover(){
        System.out.println("Andando");
    }
    @Override
    public void emitirsom(){
        System.out.println("Au!Au!Au!");
    }
    
}
