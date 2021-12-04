package _2throw;

public class Throw {
    //The throws statement in the method definition defines the type of Exception(s) the method can throw.
     static int div(int a, int b) throws ArithmeticException {
        if(b == 0) { //
            throw new ArithmeticException("Division by Zero"); //the throw keyword throws the corresponding exception, along with a custom message.
            //Multiple exceptions can be defined in the throws statement using a comma-separated list.
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        //If we call the div method with the second parameter equal to 0, it will throw an ArithmeticException with the message "Division by Zero".
        System.out.println(div(42, 0));
    }
}

