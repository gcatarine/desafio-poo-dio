package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args ) {
        Cursos curso1 = new Cursos();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descrição Bootcamp Java Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       Dev devCamila = new Dev();
       devCamila.setNome("Camila");
       devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Camila:" + devCamila.getConteudosIncritos());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos Camila:" + devCamila.getConteudosIncritos());
        System.out.println("Conteúdos concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("--------");

       Dev devJoao = new Dev();
       devJoao.setNome("Joao");
       devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Joao:" + devJoao.getConteudosIncritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos Joao:" + devJoao.getConteudosIncritos());
        System.out.println("Conteúdos concluídos Joao:" + devJoao.getConteudosConcluidos());
    }
}
