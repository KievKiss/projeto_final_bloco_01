package pao.Controller;

import java.util.ArrayList;

import pao.model.Produto;
import pao.repository.paoRepository;

public class PaoController implements paoRepository {

	private ArrayList <Produto> listaProdutos = new ArrayList<Produto>(); 
	int id = 0;
	
	@Override
	public void criarProduto(Produto Produto) {
		listaProdutos.add(Produto);
		System.out.println("O produto " + Produto.getNome()+" foi adicionado com sucesso");
		
	}

	@Override
	public void listarProdutos() {
		for(var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void consultarProdutoPorId(int id) {
		var produto = buscarNaCollection(id);
		if( produto != null)
			produto.visualizar();
		else
			System.out.println("PRODUTO NÃO CADASTRADO");
		
	}

	@Override
	public void atualizarProduto(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getId());
		if(buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO produto: " + produto.getId()+ " foi atualizado com sucess!");
		}else
			System.out.println("\nO produto: "+produto.getId()+"não foi encontrado!");
	}
	@Override
	public void deletarProduto(int id) {
		var produto = buscarNaCollection(id);
		
		if(produto != null) {
			if(listaProdutos.remove(produto)==true)
				System.out.println("\nO Produto " + produto + " foi removido com sucesso!");
		}else
			System.out.println("\nO produto + "+produto+" não foi encontrado");
				
	}
	
	public Produto buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if (produto.getId()== id) {
				return produto;
			}
		}
		return null;
	}
	
	public int gerarNumero() {
		return ++ id;
	}

}
