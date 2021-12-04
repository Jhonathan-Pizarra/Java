package _2herencia;
//import _2herencia.Animal;
//import _2herencia.Dog;


//Ojo que, para que la herencia funcione debe estar en el mismo paquete
public class TestDog {

    public static void main(String[] args) {
        // Dog class inherits the legs variable from the Animal class. 
        //We can now declare a Dog object and call the eat method of its father class (superclass)
        Dog d = new Dog();
        d.eat();
    }
    
}
