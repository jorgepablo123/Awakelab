
public class Television extends Electrodomestico {

	private static final int PrecioFinal = 0;
	int resolucion= 20;
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isTdt() {
		return tdt;
	}
	public void setTdt(boolean tdt) {
		this.tdt = tdt;
	}
	public Television(int precioBase, int peso, int resolucion, boolean tdt) {
		super(precioBase, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	boolean tdt;
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}
		//calcular precio final
	public double  Calcular1(int cantidad, double Preciofinal){
	     double  PrecioFinal=cantidad*this.precioBase;
	     return PrecioFinal;

	//if (resolucion >= 40) {
	// double PrecioFinal1= (PrecioFinal1 + PrecioFinal1*0.3);	

}
	}


