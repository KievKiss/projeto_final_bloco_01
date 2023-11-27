package pao.repository;

import pao.model.Produto;

public interface paoRepository {
	public void criarProduto(Produto Produto);
	public void listarProdutos();
	public void consultarProdutoPorId(int id);
	public void atualizarProduto(Produto produto);
	public void deletarProduto(int id);
}
