/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;

/**
 *
 * @author ED06
 */
public class Empleado {
    private String dni;
    private String nombre;
    private String direccion;
    private String cargo;
    private int numHijos;
    
    /**
     *
     * @param dni: dni empleado
     * @param nombre: nombre empleado
     */
    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
    
    /**
     *
     * @param base
     * @return Saldo total según cargo
     */
    public double calcula_sueldo(double base){
        double total=base;
        
        if(cargo.equals("ENCARGADO"))
            total+=300;
        else if(cargo.equals("DIRECTOR"))
            total+=1000;
        if(numHijos>=3)
            total+=numHijos*50;
        return total;
    }
    /*
    
    */

    /**
     *
     * @return datos empleado
     */
    public String imprimir_emp() {
        return "DNI: " + dni + ", nombre:" + nombre + ", dirección: " + direccion + ", cargo:" 
                + cargo + ", número de hijos:" + numHijos;
    }

    /**
     *
     * @return
     */
    public String getDni() {
        return dni;
    }

    /**
     *
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     *
     * @return nombre empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return dirección
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     *
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     *
     * @return número de hijos
     */
    public int getNumHijos() {
        return numHijos;
    }

    /**
     *
     * @param numHijos
     */
    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
    
    
    
}
