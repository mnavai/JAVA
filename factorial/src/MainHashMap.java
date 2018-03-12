import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.HashMap;

public class MainHashMap {

    public static void main(String[] str){

        System.out.println("Please enter a non-negative integer to return its factorial: ");
        Scanner digit = new Scanner(System.in);
        int num = digit.nextInt();
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1 ; i <= num ; i++)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("\n");
        System.out.println("The factorial of "+ num +" is: "+factorial);

        String strNum = ""+ factorial;
        int strLength = strNum.length();

        HashMap<Integer,Integer> map = new HashMap<>();



        for (int i = 0 ; i < strLength ; i++)
        {
            int singleDigit = Integer.parseInt(strNum.charAt(i)+"");


            // checks to see if that specific key is in the map
            if( map.get(singleDigit)!= null ){

                int value = map.get(singleDigit);
                value++;
                map.put(singleDigit, value);
            }
            else {
                map.put(singleDigit, 1);
            }


       }


        printMap(map);

    }


    private static void printMap(HashMap<Integer, Integer> map) {
        System.out.println("Digit"+"\t"+"Frequency"+"\t"+"Relative Frequency");

        double relFreq = 0;
        int frequency = 0;

        double sum = 0;
        for (int n : map.values())
        {
            sum += n ;
        }

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        for(Integer key : map.keySet()) {
            frequency = map.get(key);

            relFreq = (frequency/sum) * 100;

            System.out.println(key + "\t"+"\t"+"\t"+frequency+"\t"+"\t"+"\t"+ df.format(relFreq));
        }
    }

}
