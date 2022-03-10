package desadio.dio.poo;

import java.time.LocalDate;

import desadio.dio.poo.dominio.Bootcamp;
import desadio.dio.poo.dominio.Conteudo;
import desadio.dio.poo.dominio.Curso;
import desadio.dio.poo.dominio.Dev;
import desadio.dio.poo.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
        curso1.setTitulo("Java");
		curso1.setDescricao("Descrição do curso de Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
	    curso2.setTitulo("Js");
		curso2.setDescricao("Descrição do curso de Js");
		curso2.setCargaHoraria(6);
		
		Mentoria mentoria =  new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição da mentoria");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Boootcamp java Developer");
        bootcamp.setDescricao("Decrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devDeivison = new Dev();
        devDeivison.setNome("Deivison");
        devDeivison.inscreverBootcamp(bootcamp);
        devDeivison.progredir();
        
        
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Deivison: " + devDeivison.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Deivison: " + devDeivison.getConteudosConcluidos());
        System.out.println("Xp: " + devDeivison.calcularTotalXp());
        System.out.println("-----------");
        
        Dev devPedro = new Dev();
        devPedro.inscreverBootcamp(bootcamp);
        devPedro.progredir();
        
        devPedro.setNome("Pedro");
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("Xp: " + devPedro.calcularTotalXp());
        System.out.println("-----------");
        
	}

}
