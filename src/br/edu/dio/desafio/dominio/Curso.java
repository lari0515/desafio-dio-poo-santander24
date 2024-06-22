package br.edu.dio.desafio.dominio;

public class Curso {
    private String nome;
    private String ementa;
    private int cargaHoraria;

    public Curso() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "\nnome='" + nome + '\'' +
                ", \nementa='" + ementa + '\'' +
                ", \ncargaHoraria=" + cargaHoraria +
                "\n"+
                '}';
    }
}
