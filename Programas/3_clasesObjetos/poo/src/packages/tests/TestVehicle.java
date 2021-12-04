package packages.tests;
import packages.samples.Vehicle; //We need to import te classes that are inside a package in oir main to be able to use them
/**
 *
 * @author hp
 */
public class TestVehicle {
    public static void main(String[ ] args) {
        Vehicle m1 = new Vehicle();
        m1.setName("Chevrolet");
        System.out.println(m1.getName());
    }
}
