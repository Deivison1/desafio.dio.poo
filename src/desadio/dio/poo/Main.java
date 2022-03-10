package desadio.dio.poo;

import java.time.LocalDate;

import desadio.dio.poo.dominio.Curso;
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
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);

	}

}
