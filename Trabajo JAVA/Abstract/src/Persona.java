
public class Persona {
	

	    private String nombre;
	    private String apellido;
	    private int edad;
	    private boolean casado;

	    public Persona () {
	        nombre = "";
	        apellido = "";
	        edad = 0;
	        casado = false;
	    }

	    public Persona (String nombre, String apellido, int edad, boolean casado) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.edad = edad;
	        this.casado = casado;
	    }

	    public void setNombre (String nombre) {
	        this.nombre = nombre;
	    }

	    public void setApellido (String apellido) {
	        this.apellido = apellido;
	    }

	    public void setEdad (int edad) {
	        this.edad = edad;
	    }

	    public void setCasado (boolean casado) {
	        this.casado = casado;
	    }

	    public String getNombre () {
	        return this.nombre;
	    }

	    public String getApellido () {
	        return this.apellido;
	    }

	    public int getEdad () {
	        return this.edad;
	    }

	    public boolean getCasado () {
	        return this.casado;
	    }
	    
	    public String toString() {
	         String estadoCivil = " ";
	        if (this.casado == false) {
	            estadoCivil = " no ";
	        } else {};
	        Integer datoEdad = edad;
	        return getNombre() + " " + getApellido() + " tiene " + datoEdad.toString() + " a�os, y" + estadoCivil + "est� casado";
	    }
	}


