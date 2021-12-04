/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3threads;

/**
 *
 * @author hp
 */

class HiloInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("Good Bye!");
    }
}

/*It may seem that implementing the Runnable interface is a bit more complex than extending from the Thread class. 
However, implementing the Runnable interface is the preferred way to start a Thread, because it enables you to extend from another class, as well.*/