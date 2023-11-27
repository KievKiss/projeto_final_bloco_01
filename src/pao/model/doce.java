package pao.model;

public class Doce extends Produto {
	private String doce = "doce";
	
	public Doce(String nome, float preco, int tipo, int id,String doce) {
		super(nome, preco, tipo, id);
		this.doce = doce;
	}
	//getter e setter

	public String getDoce() {
		return doce;
	}

	public void setDoce(String doce) {
		this.doce = doce;
	}
	//metodos especiais
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O Recheio é: " + this.getDoce());
	}

}
