
	public class Television extends Electrodomesticos{
  
    
    private final static int RESOLUCION=20;
  
        private int resolucion;
  
        private boolean sintTDT;
  
        public double precioFinal(){
        
        double calc=super.precioFinal();
  
        
        if (resolucion>40){
            calc+=precioBase*0.3;
        }
        if (sintTDT){
            calc+=50;
        }
  
        return calc;
    }
  
        public Television(){
        this(PRECIOBASE, PESO, CONSUMOE, COLOR, RESOLUCION, false);
    }
  
   
    public Television(double precioBase, double peso){
        this(precioBase, peso, CONSUMOE, COLOR, RESOLUCION, false);
    }
  
        public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintTDT=sintTDT;
    }
}
	
	


