package bucles;

/**
 *
 * @author hp
 */
public class Cls_7Matrices {
    public static void main(String[] args) {
        int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} }; 
        int x = sample[1][0];
        System.out.println(x);
        
        int[ ][ ] myArr = { {1, 2, 3}, {4}, {5, 6, 7} }; //The above two-dimensional array contains three arrays. 
        //The first array has three elements, the second has a single element and the last of these has three elements.
        myArr[0][2] = 42;
        int y = myArr[1][0];
        
        System.out.println(y);
    }
}
