/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4clases_internas;

/**
 *
 * @author hp
 */
class Robot {
    int id;
    Robot(int i) {
        id = i;
        Brain b = new Brain();
        b.think();
    }

    //Clase interna (Una clase dentro de otra)
    private class Brain {
        public void think() {
            System.out.println(id + " is thinking");
        }
    }
}
//The inner class can access all of the member variables and methods of its outer class, but it cannot be accessed from any outside class.
//La clase main también podría estar en esta misma clase, pero la idea era entender como funcionan las clases internas