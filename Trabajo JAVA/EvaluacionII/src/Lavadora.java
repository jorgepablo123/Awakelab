
public class Lavadora extends Electrodomestico {

	int carga;
	private double doublePrecioFinal;

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public Lavadora(int precioBase, int peso, int carga) {
		super(precioBase, peso);
		this.carga = carga;
	}

	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}
	
	
	//calcular precio final
	public double  Calcular(int carga, double Preciofinal){
	     double  PrecioFinal=carga*this.precioBase;
	     return PrecioFinal;
	
	    
	    
	//if (carga > 30) {
		//doublePrecioFinal = (PrecioFinal + 50);
      //  return PrecioFinal;
	}

	}
	



