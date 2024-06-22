import br.edu.dio.desafio.dominio.Curso;
import br.edu.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Curso curso1 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setNome("Java Básico");
        curso.setDescricao("estrutura simples, estrutura condicional, estrutura de repetição, vetores");
        curso.setCargaHoraria(60);

        curso1.setNome("Java Orientado a Objetos");
        curso1.setDescricao("Pilares da programação orientada a objetos: abstração, encapsulamento, herança, polimorfismo; Interfaces");
        curso1.setCargaHoraria(60);

        mentoria.setNome("A importância das boas práticas em programação");
        mentoria.setDescricao("Discutiremos sobre os padrões de programação, como o de escrita (camelCase)");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);
    }
}