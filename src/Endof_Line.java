import java.util.*;

public class Endof_Line {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */
        try {
            Scanner n = new Scanner(System.in);
            int count = 0;
            while (n.hasNext()) {
                count = count + 1;
                System.out.println(count + " " +  n.nextLine());
                /*for(int i = 0; n.hasNext()== true;i++){
                System.out.println(i + " " + n.nextLine());
            }*/
            }

            n.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}