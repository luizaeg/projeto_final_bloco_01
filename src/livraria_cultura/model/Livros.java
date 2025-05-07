package livraria_cultura.model;

public class Livros extends Produto {

	private String genero;
	
	public Livros(int id, String nome, int tipo, float preco, String genero) {
		super(id, nome, tipo, preco);
		this.genero = genero;
				
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nome Genérico: " + this.genero);
	}

}
