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

class Dragao extends Animal {
    public Dragao(String nome, String raca) {
        super(nome, raca);
    }

    public void voar() {
        System.out.println(nome + " esta voando");
    }

    public void aterrissar() {
        System.out.println(nome + " esta aterrissando");
    }
}

class Orc extends Animal {
    public Orc(String nome, String raca) {
        super(nome, raca);
    }

    public void latir() {
        System.out.println(nome + " esta gritand");
    }

    @Override
    public void andar() {
        System.out.println(nome + " esta andando");
    }
}

public class Main {
    public static void main(String[] args) {
        Orc meuOrc = new Orc("Grom", "Orc Sangrento");
        Dragao meuDragao = new Dragao("Smaug", "Dragao Flamejante");

        System.out.println("Nome do orc: " + meuOrc.nome + " | Raca: " + meuOrc.raca);
        meuOrc.comer();
        meuOrc.latir();
        meuOrc.andar();

        System.out.println();

        System.out.println("Nome do dragao: " + meuDragao.nome + " | Raca: " + meuDragao.raca);
        meuDragao.comer();
        meuDragao.voar();
        meuDragao.aterrissar();
    }
}