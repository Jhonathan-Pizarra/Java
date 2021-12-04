
package persona;


public class Test1 {

    private String cedula;    

    public Test1() {}
    

    public String getCedula() {
        
        return cedula;
    }

    public void setCedula(String cedula) {
        
        if(cedulaValida(cedula)){ //Si el comportamiendo de cedula es como el de la cedula que paso como parámetro.
            
         this.cedula = cedula;
         
        }else{
            System.out.println("No válido.");
        }
        
       
    }
    //Salta acá
    private boolean cedulaValida(String cedula){
        
        boolean respuesta = true;
        
        //Sacar los caracteres: 1
        String digito1String = cedula.charAt(0)+" ";
        //convertir ese caracter a entero
        int digito1 = Integer.parseInt(digito1String);
        
        //O, convertir a entero, los caracteres: 1, 2, etc..)
       // int digitos = Integer.parseInt(cedula.charAt(0)+" ");
        
        System.out.println("Digitos: "+digito1);
     /*   
        //1) Esos digitos no deben ser ni menor a uno ni mayor a 24
       if( digitos > 1 && digitos < 24){
            //2)El tercer digito debe ser menor a 6
            int digito3 = Integer.parseInt(cedula.charAt(2)+" ");
                if( digito3 < 6){
                
                    //3) Los siguientes, osea a partir de aqui los numeros hasta la novena posicion son consecutivos: 123444579  (No importa si estan en seorden)
                    int tamañoCedula = 9;
                    int convertirNumeros = 0;
                    int guardarNumeros = 0; 
                    
                    for(int i = 0; i<tamañoCedula; i++){
                    
                        convertirNumeros = Integer.parseInt(cedula.charAt(i)+" ");
                        guardarNumeros = guardarNumeros+convertirNumeros; //Se irán almacenando los numeros convertidos..
                       
                    }
                    System.out.println("Numeros: "+guardarNumeros);             
                }
                    System.out.println("Digito 3 "+digito3);
                    System.out.println("Digtos: "+digitos);
      
                    
                    respuesta = false;
        //Error, estoy diciendo que retorne un boolean  a una comparacion hecha a un entero
        } else{
        
        respuesta = true;
        }
   
      
        } */
        
        return true;
    }
    
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        Test1 persona = new Test1();
        
        persona.setCedula("1705358525");    
        System.out.println("Cedula: "+persona.getCedula());
        
    }
    
}









