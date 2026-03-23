package model;

public class Cavalo {

    private String nome;
    private String raca;
    private int idade;

    public Cavalo(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public Cavalo() {
        this.nome = "Pé de Pano";
        this.raca = "Árabe";
        this.idade = 3;
    }

    public void correr() {
        System.out.println(nome + " está correndo!");
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cavalo [nome=" + nome + ", raca=" + raca + ", idade=" + idade + "]";
    }
}