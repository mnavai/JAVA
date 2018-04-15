import java.util.Scanner;

public class Main {

    public static void main (String [] str){

        System.out.println("Please enter a string to check if it's a palindrome");
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        Palindrome test = new Palindrome();
        test.removeWhiteSpace(input);
        test.removePunctuation(input);

        System.out.println("\n"+input + "\n"+" is a palindrome at character level? "+ test.isPalindromeCharLevel()+"\n\n") ;

        test.removeWhiteSpace(input);
        test.removePunctuation(input);
        System.out.println(input+ "\n"+" is a word level palindrome? "+ test.isPalindromeWordLevel());

    }
}

//
//King, are you glad you are king
//
//
//word:             King are you glad you are king  pass
//character:        Kingareyougladyouareking        fail