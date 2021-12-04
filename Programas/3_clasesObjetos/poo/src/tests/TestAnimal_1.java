package tests;

public class TestAnimal_1 {
    public static void main(String[ ] args) {
        Animal dog; //Declaro la variable "perro" de tipo "Animal"
        new Animal(); //Creo el objeto en memoria con los valores por defecto según los atributos que tenga
        dog = new Animal(); //Referencio mi variable a mi objeto.
        //También podemos ahorranos esas 3 lineas en una sola sentencia, como con las variables, inicializarlas:
        Animal cat = new Animal(); //creamos un nuevo objeto "gato" de tipo Animal
        dog.bark();
        //cat.bark(); 
    }
}
