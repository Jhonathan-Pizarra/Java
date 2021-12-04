
package test10;

public class Test10_2 {
 
    public static void main(String[] args) {
        // TODO code application logic here
        Datos estudiante = new Datos();
        
        //Metodos Setter...
        estudiante.setNombre("Jhonathan");
     
        byte edad = 19;
        estudiante.setEdad(edad); //En el byte no hay como hcacer un set directo, sino que hay que darle por anticipado...
       
        estudiante.setPeso(51.3);
        estudiante.setFechaDeNacimiento(1997, 11,19);
        estudiante.setSexo('M');
        
        //Esos han sido los setter, para coloar el valor
        
        //Metodos Getter...
        
        System.out.println("Datos: ");
        System.out.println("Nombre: "+estudiante.getNombre());
        System.out.println("Edad: "+estudiante.getEdad());
        System.out.println("Peso: "+estudiante.getPeso());
        System.out.println("Sexo: "+estudiante.getSexo());
        System.out.println("Nació en: "+estudiante.getFechaDeNacimiento());
        
        // Notese que ahora el objeto "estudiante" no está sobreado, es porque ya estamos dando valores al objeto, colocandolos y obteneindolos
        //Ahora veamos que pasa si un "atrubuto" tiene arreglo... Ver el Test:10_3
    }
    
}
