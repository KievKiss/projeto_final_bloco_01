package pao.model;

public class Sal extends Produto{
	private String salgado;
	
	public Sal(String nome, float preco, int tipo, int id,String salgado) {
		super(nome,preco, tipo, id);
		this.salgado = salgado;
	}
	//getter e setter
	
	public String getSalgado() {
		return salgado;
	}
	public void setSalgado(String salgado) {
		this.salgado = salgado;
	}
	//metodo especial	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Recheio: " + this.getSalgado());
	}
}
