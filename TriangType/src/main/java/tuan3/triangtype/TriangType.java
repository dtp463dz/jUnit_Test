
package tuan3.triangtype;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TriangType {

    public static boolean isTriangLe(int a, int b, int c){
        return a+b>c && a+c>b && b+c>a;
    }
    public static String classifyTriangle(int a, int b, int c){
        if(isTriangLe(a, b, c)){
            if(a == b && b == c){
                return "Equilateral"; // tam giac deu
            }else if (a == b || a == c || b == c) {
                return "Isosceles";  // tam giac can
            } else if(a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a){
                return "Right triangle"; // Tam giác vuông
            }else{
                return "Scalene"; // tam giac thuong
            }
        }else{
            return "NotATriangle"; // k phair tam giac
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập độ dài cạnh b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập độ dài cạnh c: ");
        int c = scanner.nextInt();

        String triangleType = classifyTriangle(a, b, c);
        System.out.println("Loại tam giác: " + triangleType);
    }
}
