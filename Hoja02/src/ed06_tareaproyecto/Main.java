package ed06_tareaproyecto;


/**
 *
 * @author ED06
 */
public class Main {
   
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Empleado empleado01 = new Empleado("1245678M","Perico de los Palotes");
        
        empleado01.setDireccion("C/del Pez,6");
        empleado01.setNumHijos(3);
        System.out.println(empleado01.imprimir_emp());
    }
    
}
