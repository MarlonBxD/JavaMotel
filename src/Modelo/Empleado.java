
package Modelo;



public class Empleado {
    private String idEmpleado;
    private String nombre;
    private String cargo;
    private String usuario;
    private String contraseña;

    public Empleado() {
    }

    public Empleado(String idEmpleado, String nombre, String cargo, String usuario, String contraseña) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.cargo = cargo;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    

    

    
    
    
}
