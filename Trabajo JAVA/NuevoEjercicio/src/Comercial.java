
public class Comercial extends Persona{
	
	private double Comision;
	
	public Comercial(double comision, String nombre, int edad, double salario) {
		super(nombre,edad,salario);
	this.Comision=comision;
}

public boolean Plus(){
     if(super.getedad()>30 && this.Comision>200)

     {
	double NuevoSalario= (super.getsalario()+this.Plus);
	super.setsalario(NuevoSalario);
	return true;
     }	

	return false;

}

public void mostrarDatos() {
				
}
}
	
	
	
	
	
	
	
	
	
	
	


