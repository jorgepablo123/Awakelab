
public  class Producto {
	
		  String Nombre;
		 public double Precio;
		 public double  Calcular(int Cantidad){
    	     double  PrecioTotal=Cantidad*this.Precio;
    	     return PrecioTotal;
		}
		 	 
		 public Producto(String Nombre,double Precio){
		     this.Nombre=Nombre;
		     this.Precio=Precio;
		 }
		 public String getNombre(){
		     return this.Nombre;
		 }
		 public void setnombre(String Nombre){
		     
		     this.Nombre=Nombre;
		 }
		 public double getPrecio(){
		     return this.Precio;
		 }
		 public void setPrecio(double Precio){
		    this.Precio=Precio;
		 }
		 
}

		


