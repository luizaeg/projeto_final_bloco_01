package livraria_cultura.model;

public class CDs extends Produto {

	private String estilo;
	
	public CDs(int id, String nome, int tipo, float preco, String estilo) {
		super(id, nome, tipo, preco);
		this.estilo = estilo;	
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.estilo);
	
    }
}
