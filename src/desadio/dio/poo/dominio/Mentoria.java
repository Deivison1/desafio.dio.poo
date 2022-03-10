package desadio.dio.poo.dominio;

import java.time.LocalDate;

public class Mentoria {
	
    private String tiutulo;
	private String descricao;
	private LocalDate data;
	
	
	public Mentoria() {
	
	}
	public String getTiutulo() {
		return tiutulo;
	}
	public void setTiutulo(String tiutulo) {
		this.tiutulo = tiutulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Mentoria [tiutulo=" + tiutulo + ", descricao=" + descricao + ", data=" + data + "]";
	}

}
