package pao.model;

public class sal extends produto{
	private String salgado = "salgado";
	
	public sal(String nome, String recheio, float preco, int tipo, int id,String salgado) {
		super(nome, recheio, preco, tipo, id);
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
