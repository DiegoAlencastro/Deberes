package tarea1;

public class Empleadoss extends Personass{

    private String cargo;
    private int salario;

    public Empleadoss(String nombre, String identificacion, int edad,String cargo, int salario) {
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
