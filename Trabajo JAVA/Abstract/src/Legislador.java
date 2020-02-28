public abstract class Legislador extends Persona{
    String provinciaQueRepresenta;
    String partidoPolitico;
    int numeroDespacho;
    
    public Legislador () {
        super ();
        provinciaQueRepresenta = "";
        partidoPolitico = "";
        numeroDespacho = 0;
    }
    
    public Legislador (String nombre, String apellido, int edad, boolean casado, String provinciaQueRepresenta, String partidoPolitico, int numeroDespacho) {
        super (nombre, apellido, edad, casado);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
        this.numeroDespacho = numeroDespacho;
    }
    
    public void setProvinciaQueRepresenta (String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }
    
    public void setPartidoPolitico (String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    
    public void setNumeroDespacho (int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }
    
    public String getProvinciaQueRepresenta () {
        return provinciaQueRepresenta;
    }
    
    public String getPartidoPolitico () {
        return partidoPolitico;
    }
    
    public int getNumeroDespacho () {
        return numeroDespacho;
    }
    
    public String toString () {
        return super.toString() + "\nRepresenta a la Provincia de " + getProvinciaQueRepresenta() + " para el " + getPartidoPolitico() + "\nSu número de despacho es " + getNumeroDespacho(); 
    }
    
    abstract public void getCamaraEnQueTrabaja();
    
}


