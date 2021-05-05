
/* WAP to square every digit of a number and concatenate them
 * * for example: if we run 9119 through the function,811181 will come out, because 9*9 is 81 and 1*1 is 1.*/
public class SquareDigits {
    public static void main(String[] args){
        int ans = 9119;
        System.out.print(squareDigits(ans));
    }
    static int squareDigits(int n){
        String temp = Integer.toString(n);
        int digits;
        StringBuilder square = new StringBuilder();
        for(int i=0;i<temp.length();i++){
            digits = temp.charAt(i) - '0';
            square.append(digits * digits);
        }
        return Integer.parseInt(square.toString());
    }
}
