/* TEMAS
 * Operadores Artiméticos
 * Casting
 * Operadores ´de Incremento y Decremento
 * Operadores ´de Asignacion
 */
package basicos;

public class Cls_3Operadores {
    
    public static void main(String[] args){
          
   //Operadores Ariméticos, reucerda que obecen al orden de la aritmética y la agrupación
    // +, - , * , / , %
    int num1 = 2;
    int num2 = 2;
    int division = num1/num2; //devuelve un entero, si divido 2 decimales, me devolverá un resultado decimal
  
    //Casting
    double division2 = (double)num1/(double)num2;
    
        System.out.println(division2);

    
    //Operadores ´de Incremento y Decremento
    // ++, -- (Pueden ser de tipo: prefijos (++n) o postfijos(n++))
    
     //Operadores de Asignacion
    // +=, -=, /=, *=
    //Por ejemplo: 
        // numero += 2 => numero = numero + 2;

    
    
    }


}
