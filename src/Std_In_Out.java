import java.util.Scanner;

public class Std_In_Out {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Integer Value: ");
        int i = scan.nextInt();
        System.out.print("Enter Double Value: ");
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter String Value: ");
        String s;
        s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
