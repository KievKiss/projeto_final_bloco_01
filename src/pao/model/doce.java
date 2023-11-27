package pao.model;

public class doce extends produto {
	private String doce = "doce";
	
	public doce(String nome, String recheio, float preco, int tipo, int id,String doce) {
		super(nome, recheio, preco, tipo, id);
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
