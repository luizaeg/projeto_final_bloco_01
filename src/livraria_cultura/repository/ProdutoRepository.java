package livraria_cultura.repository;

import livraria_cultura.model.Produto;

public interface ProdutoRepository {
	
	
	public void procurarPorId(int id);
	public void listarTodos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int id);

}
