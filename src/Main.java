import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //instanciando
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        //instanciando
        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(8);

        //instanciando
        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição da mentoria");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1) ;
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("        Camila");
        devCamila.increverBootcamp(bootcamp);
        System.out.println(devCamila.getNome());
        System.out.println("Conteúdos Inscritos: "+ devCamila.getConteudoIncrito());
        System.out.println("-");
        System.out.println("Progredindo...");
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos: "+ devCamila.getConteudoIncrito());
        System.out.println("Conteúdos Concluidos: "+ devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXP());


        System.out.println("**************************");
        Dev devfernanda = new Dev();
        devfernanda.setNome("        Fernanda");
        devfernanda.increverBootcamp(bootcamp);
        System.out.println(devfernanda.getNome());
        System.out.println("Conteúdos Inscritos: "+ devfernanda.getConteudoIncrito());
        System.out.println("-");
        System.out.println("Progredindo...");
        devfernanda.progredir();
        System.out.println("Conteúdos Inscritos: "+ devfernanda.getConteudoIncrito());
        System.out.println("Conteúdos Concluidos: "+ devfernanda.getConteudosConcluidos());
        System.out.println("XP: " + devfernanda.calcularTotalXP());

        System.out.println("**************************");
        Dev devJoao = new Dev();
        devJoao.setNome("        João");
        System.out.println(devJoao.getNome());
        System.out.println("Conteúdos Inscritos: "+ devJoao.getConteudoIncrito());
        System.out.println("Conteúdos Concluidos: "+ devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());




    }
}