package poo;

/**
 *
 * @author hp
 */
public class Cls_2Methods_Parameters {
    
      static void sayHello(String name) {
        //The advantages of using methods instead of simple statements include the following:
        //code reuse: You can write a method once, and use it multiple times, without having to rewrite the code each time.
        //parameters: Based on the parameters passed in, methods can perform various actions.
        System.out.println("Hello " + name);
    }
      
     public static void main(String[ ] args) {
        sayHello("David");
        sayHello("Amy");
    }
}
