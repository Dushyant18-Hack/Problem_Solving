/*The goal of this exercise is to convert a string to a new string where each character in the new string is
"(" if that character appears only once in the original string, or ")"
if that character appears more than once in the original string.
Ignore capitalization when determining if a character is a duplicate
Example:-
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))((" */

public class DuplicateEncoder {
    public static void main(String[] args){ // main method
        String callF = encode("Prespecialized");//calling the encode function in main method
        System.out.print(callF);
    }
    static String encode(String word){
        //create a string variable val to hold string value to ingnores cases
        String val = word.toLowerCase();
        //create a character to convert string to a single character in a array from
        char[] ch = val.toCharArray();
        //create a val to hold finished string to return after it's loop through
        var unique = "";
        //loop throught all letter in string
        for(int i = 0; i<val.length();i++){
            //checking the every character that repeats
            if(!(val.lastIndexOf(ch[i]) == val.indexOf(ch[i]))){
                unique += ")";//replace with ")" that character that not has duplicate
            }
            else
            {
                unique += "(";//replace with "(" that cahracter that has duplicate
            }
        }
        return unique;//return the final value that has ( for duplicate and this ) for not duplicates
    }
}


//Solution 2
/*public class DuplicateEncoder {
    static String encode(String word) {
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }

}*/
