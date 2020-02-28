public class Noperecedero extends Producto {
      private String Tipo;

      public Noperecedero(String Tipo,String Nombre,double Precio){
    	  super(Nombre,Precio);
    	  this.Tipo=Nombre;     	    	  
      }
      
      
      public String getTipo() {
    	  return Tipo;
      }
      public void setTipo(String Tipo) {
    	  this.Tipo = Tipo;
      }
      public String MostrarDatos(){
    	  return("NOMBRE: "+this.Nombre+" PRECIO: "+this.Precio+" TIPO: "+this.Tipo);
      }  
}
	


