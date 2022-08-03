package TareaHerencia;

public class Empleado extends Persona{

    private String cargo;
    private int salario;

    public Empleado(String nombre, String identificacion, int edad,String cargo, int salario) {
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
