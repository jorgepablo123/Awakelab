import java.util.Date;
import java.text.SimpleDateFormat;


public class Funciones {
	
	public Funciones(String Horario,String Nombre,double Precio) {
	}
		private Date fecha;
	    private int asientos;
	    private int asientos_disponibles;
	    

	   public Funciones( int butacas, int butacas_disponibles, int anyo, int mes, int dia, int hora, int minuto)
	    {
	              
	        
	        this.asientos = asientos;
	        this.asientos_disponibles = butacas_disponibles;
	        fecha = new Date(anyo, mes, dia, hora, minuto);
	    }
	    
	    public Funciones()
	    {
	        // initialise instance variables
	       
	    }
	    
	   
	    public int actualizarButacasVendidas(int vendidas)
	    {
	        if(asientos_disponibles < vendidas ) {
	            System.out.println("No hay tantas entradas disponibles!!");     
	        }
	        else {
	            asientos_disponibles = asientos_disponibles - vendidas;
	        }
	        return asientos_disponibles;
	    }
	    
	    
	    public void mostrarInfoSesion()
	    {
	     SimpleDateFormat sdf = new SimpleDateFormat("d-MMMM-yyyy H:mm");
	     String s = sdf.format(fecha);
	     System.out.println();
	     System.out.println("Fecha y hora de la sesion " + s);
	     System.out.println("Asientos que tiene la sala: " + asientos);
	     System.out.println("Asientos disponibles: " + asientos_disponibles);
	     System.out.println();
	    
    	 
	
	
	}
}
