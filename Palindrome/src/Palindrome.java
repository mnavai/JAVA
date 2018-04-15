import java.util.Stack;

public class Palindrome {
        //maryram
        //mary

        Stack<String> myString = new Stack();
        String originalString;
        String finalString;
        //Removes punctuation from a given string
        public void removePunctuation(String givenStr)
        {

            finalString = givenStr.replaceAll("!","");
            originalString = finalString;

        }

        //Removes white space from a given string
        public void removeWhiteSpace(String givenStr ){


            finalString = givenStr.replaceAll("\\s","");


        }


        //Returns true if a the string is a palindrome and false otherwise
        public Boolean isPalindromeCharLevel(){

          for (int i = 0 ; i < finalString.length(); i++)
          {
                  String singleChar = finalString.charAt(i)+"";
                  myString.push(singleChar);

          }
          String newString = "";
          while ( ! myString.empty())
          {
                  newString += myString.pop();
          }


          return finalString.equals(newString);



        }

        public Boolean isPalindromeWordLevel()
        {

                String[] word = originalString.split("\\s+");

                for (int i = 0 ; i< word.length ; i++)
                {

                    myString.push(word[i]);

                }

                String poppedString = "";
                while ( ! myString.empty())
                {
                    poppedString = poppedString + myString.pop() + " " ;
                }

                return originalString.equals(poppedString.trim());

        }


}
