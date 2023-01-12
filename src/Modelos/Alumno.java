package Modelos;

public class Alumno {
    //Atributos 
    private String dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private double nota;

    //Constructor
    public Alumno(String dni, String nombre, String apellido, String ciudad, double nota) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.nota = nota;
    }
    
    //Getters y setters
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
}
