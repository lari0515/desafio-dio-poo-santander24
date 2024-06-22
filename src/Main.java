import br.edu.dio.desafio.dominio.Bootcamp;
import br.edu.dio.desafio.dominio.Curso;
import br.edu.dio.desafio.dominio.Dev;
import br.edu.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Curso curso1 = new Curso();

        curso.setNome("Java Básico");
        curso.setDescricao("estrutura simples, estrutura condicional, estrutura de repetição, vetores");
        curso.setCargaHoraria(60);

        curso1.setNome("Java Orientado a Objetos");
        curso1.setDescricao("Pilares da programação orientada a objetos: abstração, encapsulamento, herança, polimorfismo; Interfaces");
        curso1.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();

        mentoria.setNome("A importância das boas práticas em programação");
        mentoria.setDescricao("Discutiremos sobre os padrões de programação, como o de escrita (camelCase)");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Santander Java 2024");
        bootcamp.setDescricao("Aprenda a fazer programas com a linguagem java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev desenvolvedor = new Dev();
        Dev desenvolvedor1 = new Dev();

        desenvolvedor.setNome("Larissa");
        desenvolvedor.inscreverBootcamp(bootcamp);

        desenvolvedor1.setNome("João Victor");
        desenvolvedor1.inscreverBootcamp(bootcamp);

        System.out.println(desenvolvedor.getNome() + " está inscrito(a) nos conteúdos: " + desenvolvedor.getConteudosInscritos());
        desenvolvedor.progredir();
        System.out.println(desenvolvedor.getNome() + " está inscrito(a) nos conteúdos: " + desenvolvedor.getConteudosInscritos());
        System.out.println(desenvolvedor.getNome() + " concluiu os conteúdos: " + desenvolvedor.getConteudosConcluidos());
        System.out.println("XP: " + desenvolvedor.calcularXpTotal());

        System.out.println("\n--------------------------------------------------------------\n");

        System.out.println(desenvolvedor1.getNome() + " está inscrito(a) nos conteúdos: " + desenvolvedor1.getConteudosInscritos());
        desenvolvedor1.progredir();
        desenvolvedor1.progredir();
        System.out.println(desenvolvedor1.getNome() + " está inscrito(a) nos conteúdos: " + desenvolvedor1.getConteudosInscritos());
        System.out.println(desenvolvedor1.getNome() + " concluiu os conteúdos: " + desenvolvedor1.getConteudosConcluidos());
        System.out.println("XP: " + desenvolvedor1.calcularXpTotal());
    }
}