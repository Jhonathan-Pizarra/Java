package tests;

/**
 *
 * @author hp
 */
public class TestPet_7 {
    public static void main(String[ ] args) {
        Pet j;
        j = new Pet("Gato");
        j.setAge(20);
        celebrateBirthday(j); //A reference type stores a reference (or address) to the memory location where the corresponding data is stored.
       
        
        System.out.println(j.getAge());//Because j is a reference type, the method affects the object itself, and is able to change the actual value of its attribute.
  }
   
    static void celebrateBirthday(Pet p) {
        p.setAge(p.getAge() + 1);  //The method celebrateBirthday takes a Pet object as its parameter, and increments its attribute.
    }
}

//Arrays and Strings are also reference data types.
//Recuerda, en paso por valor, elvalor no cambia, puedes oeprerar pero el valor se mantendrá como es originalmente,
//Mientras que en paso por referencia, se modifica a nivel de memoria, una vez modificado ese será el valor que quedará.