package tests;

/**
 *
 * @author hp
 */
public class TestBoat_6 {
     public static void main(String[ ] args) {
        int x = 5;
        addOneTo(x); //Here we pass a value to our method
        System.out.println(x);       
    }

     //when you pass them to a method, you basically operate on the variable's value, rather than on the variable itself.
    static void addOneTo(int num) {
        num = num + 1;
    } //The method from the example above takes the value of its parameter, which is why the original variable is not affected and 5 remains as its value.
}
