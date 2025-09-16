class Animal {
    String nome;
    String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void comer() {
        System.out.println(nome + " esta comendo.");
    }

    public void andar() {
        System.out.println(nome + " esta andando.");
    }
}

class Ave extends Animal {
    public Ave(String nome, String raca) {
        super(nome, raca);
    }

    public void voar() {
        System.out.println(nome + " Está caindo");
    }

    public void aterrissar() {
        System.out.println(nome + " Está pulando");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public void latir() {
        System.out.println(nome + " Está gritando");
    }

    @Override
    public void andar() {
        System.out.println(nome + " Está correndo ");
    }
} 

public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex", "Doberman");
        Ave minhaAve = new Ave("Piu", "Passarinho");

        System.out.println("Nome do cachorro: " + meuCachorro.nome + " | Raca: " + meuCachorro.raca);
        meuCachorro.comer();
        meuCachorro.latir();
        meuCachorro.andar();

        System.out.println();

        System.out.println("Nome da ave: " + minhaAve.nome + " | Raca: " + minhaAve.raca);
        minhaAve.comer();
        minhaAve.voar();
        minhaAve.aterrissar();
    }
}

