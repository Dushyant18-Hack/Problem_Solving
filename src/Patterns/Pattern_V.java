/*
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *
 *  *
 *
*/


package Patterns;
import java.util.*;
//Pattern 5 //Method 1
/*
class Pattern_V{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int l = 1;l<=n;l++){
            for(int k = 1;k<=n-l;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/
//Pattern 5 //Method 2
class Pattern_V{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = 2 * n - 1;
        for(int i = 1; i<=rows; i++) {
            if(i<=n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*  ");
                }
            }
            else{
                for(int k = 1; k<=rows-i+1; k++){
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}
