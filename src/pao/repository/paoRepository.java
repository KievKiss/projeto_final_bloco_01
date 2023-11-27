package pao.repository;

import pao.model.produto;

public interface paoRepository {
	public void criarProduto(produto produto);
	public void listarProdutos();
	public void consultarProdutoPorId(int id);
	public void atualizarProduto(int id);
	public void deletarProduto(int id);
}
