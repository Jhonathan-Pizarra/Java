/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _enums;

/**
 *
 * @author hp
 */
public class Enums {
    enum Rank {
        SOLDIER,
        SERGEANT,
        CAPTAIN
    }
    public static void main(String[] args) {
        Rank a = Rank.SOLDIER;
                
        switch(a) {
            case SOLDIER:
                System.out.println("Soldier says hi!");
                break;
            case SERGEANT:
                System.out.println("Sergeant says Hello!");
                break;
            case CAPTAIN:
                System.out.println("Captain says Welcome!");
                break;
        }
    }
}