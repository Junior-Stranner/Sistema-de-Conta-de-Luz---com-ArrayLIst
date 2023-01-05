package PagarContaLuz;

public class Luz{
	private int cep;
	private String nome;
	private double valorLuz;
	private double horaConsumo;
	private double valorPagar;
	
	
	public Luz(int cep, String nome, double valorLuz, double horaConsumo, double valhoraConsumoorPagar) {
		super();
		this.cep = cep;
		this.nome = nome;
		this.valorLuz = valorLuz;
		this.horaConsumo = horaConsumo;
		this.valorPagar = valorPagar;
	}
	public Luz() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorLuz() {
		return valorLuz;
	}
	public void setValorLuz(double valorLuz) {
		this.valorLuz = valorLuz;
	}
	public double getConsumo() {
		return horaConsumo;
	}
	public void setConsumo(double horaConsumo) {
		this.horaConsumo = horaConsumo;
	}
	public double getValorPagar() {
		return valorPagar;
	}
	public void setValorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}
	
	
	
}