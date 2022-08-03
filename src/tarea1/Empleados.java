package tarea1;

public class Empleados extends Personas{

    private String cargo;
    private int salario;

    public Empleados(String nombre, String identificacion, int edad,String cargo, int salario) {
        super.setNombre(nombre);
        super.setIdentificacion(identificacion);
        super.setEdad(edad);
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
