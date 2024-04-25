
package save.project1;

/**
 *
 * @author Admin
 */
public class Project1 {

     public static void main(String[] args) {
        int[] a = {2, 3, 5, 6, 4, 8, 9, 11};
        
        int sum = 0;
        for (int x: a)
            if (Utils.ktNt(x) == true)
                sum += x;
        
        System.out.println(sum);
    }
}
