/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

/**
 *
 * @author hp
 */
public class Cls_4Break {
     public static void main(String[] args) {
        int x = 1;
        
        while(x > 0) {
            System.out.println(x);
            if(x == 4) {
                break; //The break and continue statements change the loop's execution flow.
                //The break statement terminates the loop and transfers execution to the statement immediately following the loop.
            }
            x++;
        }
        
         for(int y=10; y<=40; y=y+10) {
            if(y == 30) {
                continue; //The continue statement causes the loop to skip the remainder of its body and then immediately retest its condition prior to reiterating. 
                //In other words, it makes the loop skip to its next iteration.
            }
            System.out.println(x);
        }
    }
}
