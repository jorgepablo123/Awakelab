
public class Electrodomestico {
	
	
	int precioBase = 100;
	private String blanco;
	

	public double  Calcular(int carga){
	     double  PrecioFinal=carga*this.precioBase;
	     return PrecioFinal;
	}
	
	public Electrodomestico(int precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}
	public Electrodomestico(String string) {
		// TODO Auto-generated constructor stub
	}
	public Electrodomestico(String string, int peso2) {
		// TODO Auto-generated constructor stub
	}
	String color= blanco;
	private char F;
	char consumoE= F;
	int peso = 5;
	
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getConsumoE() {
		return consumoE;
	}
	public void setConsumoE(char consumoE) {
		this.consumoE = consumoE;
	
	
	 
	//if ( consumoE = 'A'||'B'||'C'||'D'||'E'||'F') {
	    //	boolean consumoE1 = true;


}
}
	 
	 