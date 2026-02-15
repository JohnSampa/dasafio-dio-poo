import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.of(2026,4,23));


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println();
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJohn = new Dev();
        devJohn.setNome("John");
        devJohn.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos John: "+ devJohn.getConteudosInscritos());
        devJohn.proguedir();
        devJohn.proguedir();
        System.out.println("===");
        System.out.println("Conteúdos Inscritos John: "+ devJohn.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos John: "+ devJohn.getConteudosConcluidos());
        System.out.println("XP: "+ devJohn.calcularTotalXp());

        System.out.println("------------------------------------");

        Dev devStefanie = new Dev();
        devStefanie.setNome("Stefanie");
        devStefanie.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Stefanie: "+ devStefanie.getConteudosInscritos());
        devStefanie.proguedir();
        devStefanie.proguedir();
        devStefanie.proguedir();
        System.out.println("===");
        System.out.println("Conteúdos Inscritos Stefanie: "+ devStefanie.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Stefanie: "+ devStefanie.getConteudosConcluidos());
        System.out.println("XP: "+ devStefanie.calcularTotalXp());


    }
}
