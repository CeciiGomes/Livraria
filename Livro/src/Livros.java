import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Livros implements Identificavel{
	
	@Id
	private int isbn;
	private String titulo;
	private int ano;
	private String editora;
	private String autores;
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
		
		
	}
	
}
