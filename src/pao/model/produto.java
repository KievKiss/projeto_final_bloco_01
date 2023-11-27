package pao.model;

public abstract class produto {
	//atributos
	 private String nome;
	 private float preco;
	 private int tipo,id;
	 //constructor
	public produto(String nome, String recheio, float preco, int tipo, int id) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
		this.id = id;
	}
// getter e setter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
// metodos personalizados
	 //metodos personalizados
		public void visualizar() {

			String tipo = "";
			
			switch(this.tipo) {
			case 1:
				tipo = "doce";
			break;
			case 2:
				tipo = "salgado";
			break;
			default:
			}
			
			System.out.println("\n\n***********************************************************");
			System.out.println("ID do produto: "+this.getId());
			System.out.println("Tipo do pão:" + this.getNome());
			System.out.println("O Recheio é: " + tipo);
			System.out.println("O preço do seu " +this.getNome()+ " é " +this.getPreco());
			
			
		}
	
	
	
	
  
}

