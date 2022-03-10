package desadio.dio.poo.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
	
		Curso  curso1 = new Curso();
		curso1.setTiutulo("curso js");
		curso1.setDescricao("descrição curso js");
		curso1.setCargaHoraria(7);
		

		Mentoria mentoria = new Mentoria();
		mentoria.setTiutulo(" mentoria java ");
		mentoria.setDescricao(" descrição mentoria ");
		mentoria.setData(LocalDate.now());
		
		Curso  curso2 = new Curso();
		curso2.setTiutulo("curso java");
		curso2.setDescricao("descrição curso java");
		curso2.setCargaHoraria(8);
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);

	}

}
