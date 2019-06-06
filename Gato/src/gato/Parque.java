package parque;

public class Parque {

    public static void main(String[] args) {
        Gato i = new Gato("Kude");
        i.macho = true;
        i.idade = 1;
        i.raca = "viralata";
        i.miar();
        
        Gato j = new Gato("Ark");
        j.macho = true;
        j.idade = 2;
        j.raca = "viralata";
        j.miar();
    }
    
}
