class Animal {
    private String nome;
    private String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void comer() {
        System.out.println(this.nome + " está comendo.");
    }

    public void andar() {
        System.out.println(this.nome + " está andando.");
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }
}


class Dragao extends Animal {
    public Dragao(String nome, String raca) {
        super(nome, raca);
    }

    public void voar() {
        System.out.println(this.nome + " está voando.");
    }

    public void aterrissar() {
        System.out.println(this.nome + " está aterrissando.");
    }
}


class Orc extends Animal {
    public Orc(String nome, String raca) {
        super(nome, raca);
    }

    public void latir() {
        System.out.println(this.nome + " está gritando."); 
    }

    public void andar() {
        System.out.println(this.nome + " está andando.");
    }
}


public class Main {
    public static void main(String[] args) {
        
        Orc meuOrc = new Orc("Grom", "Orc Sangrento");
        Dragao meuDragao = new Dragao("Smaug", "Dragão Flamejante");

        System.out.println("Informações do Orc");
        System.out.println("Nome do orc: " + meuOrc.getNome() + " | Raça: " + meuOrc.getRaca());
        meuOrc.comer();
        meuOrc.latir();
        meuOrc.andar();

        System.out.println("\nInformações do Dragão");
        System.out.println("Nome do dragao: " + meuDragao.getNome() + " | Raça: " + meuDragao.getRaca());
        meuDragao.comer();
        meuDragao.voar();
        meuDragao.aterrissar();
    }
}

}

