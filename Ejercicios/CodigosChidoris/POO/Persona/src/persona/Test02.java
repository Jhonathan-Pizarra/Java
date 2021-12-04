/*
El programa recibe una cadena de caracteres "1233456", y me los imprime uno por uno
y me los convierte a entero, mediante un set
 */
package persona;


public class Test02 {
    
    private String numero;

    public Test02() {}
    
    
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        
        int acumulador = 0;
        
        for(int i = 0; i<numero.length(); i++){
            
        char extraerNumero = numero.charAt(i); //extraer el caracer en la posicion 0 del seteado del ojeto numero
        String transformarNumero = Character.toString(extraerNumero); //transformar a cadena ese caracter
        int convertirNumero = Integer.parseInt(transformarNumero); // convertir a entero esa cadena
        
        acumulador += convertirNumero;
        
        }
        System.out.println("Acumulador: "+acumulador);
       
        if(acumulador >= 0){
            
         this.numero = numero;
        }else{
        
            System.out.println("No");
        }
        
        
     
        
        
        
    }
    

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Test02 objeto = new Test02();
        
        objeto.setNumero("12345");
        System.out.println("Numero en cadena: "+objeto.getNumero());
        
    }

    
    
}
