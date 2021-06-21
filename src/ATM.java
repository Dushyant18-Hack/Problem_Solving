
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */

class ATM
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int draw = sc.nextInt();
        Double Bal = sc.nextDouble();
        if(draw%5 == 0){
            System.out.println((Bal-0.50) - draw);
        }
        else if(draw%5 != 0){
            System.out.println(Bal);
        }
        else if(draw <= Bal){
            System.out.println(Bal);
        }
    }
}
