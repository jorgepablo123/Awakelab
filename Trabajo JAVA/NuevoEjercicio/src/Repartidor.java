
	public class Repartidor extends Persona {
     private int  Zona;
     int numero=0;
  public Repartidor(int  Zona,String nombre ,int edad,double salario){
           super(nombre,edad,salario);
     this.Zona=Zona;
      }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
  
   public  boolean Plus(){
      if(super.getedad()<25 && this.Zona==3){
         double Nuevo=(super.getsalario()+this.Plus);   
         super.setsalario(Nuevo);
         return true;
      }
   return(false);   
     
  }
     
  public void mostrarDatos(){
  
      
   System.out.println("NOMBRE: "+this.nombre+"EDAD: "+this.edad+"SALARIO: "+this.salario+"Zona"+this.Zona);
 }
  }



