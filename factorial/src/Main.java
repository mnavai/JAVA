import javax.xml.bind.SchemaOutputResolver;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

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

       // HashMap<Integer,Integer> counter = new HashMap<>();

        int zeroCounter = 0;
        int oneCounter = 0;
        int twoCounter =0;
        int threeCounter =0;
        int fourCounter =0;
        int fiveCounter =0;
        int sixCounter =0;
        int sevenCounter = 0;
        int eightCounter =0;
        int nineCounter =0;


        for (int i = 0 ; i < strLength ; i++)
        {
            int singleDigit = Integer.parseInt(strNum.charAt(i)+"");

            //System.out.println(singleDigit);


                if (singleDigit == 0) {


                    zeroCounter = zeroCounter + 1;
                    //counter.put(0, zeroCounter);

                } else if (singleDigit == 1) {

                    oneCounter = oneCounter + 1;
                    //counter.put(1, oneCounter);

                } else if (singleDigit == 2) {

                    twoCounter = twoCounter +1;
                    //counter.put(2, twoCounter);

                } else if (singleDigit == 3) {


                    threeCounter = threeCounter + 1;
                    //counter.put(3, threeCounter);

                } else if (singleDigit == 4) {


                    fourCounter = fourCounter +1 ;
                    //counter.put(4, fourCounter);

                } else if (singleDigit == 5) {


                    fiveCounter = fiveCounter + 1;
                   // counter.put(5, fiveCounter);

                } else if (singleDigit == 6) {


                    sixCounter = sixCounter + 1;
                    //counter.put(6, sixCounter);

                } else if (singleDigit == 7) {


                    sevenCounter = sevenCounter + 1;
                   // counter.put(7, sevenCounter);

                } else if (singleDigit == 8) {


                    eightCounter = eightCounter + 1;
                    //counter.put(8, eightCounter);


                } else
                    {


                    nineCounter = nineCounter + 1;
                    //counter.put(9, nineCounter);

                }



       }



        float total = zeroCounter + oneCounter + twoCounter + threeCounter + fourCounter + fiveCounter + sixCounter
                  + sevenCounter + eightCounter + nineCounter ;

        float relFrequencyOfZero = zeroCounter / total ;
        float relFrequencyOfOne = oneCounter / total ;
        float relFrequencyOfTwo = twoCounter / total;
        float relFrequencyOfThree = threeCounter / total ;
        float relFrequencyOfFour = fourCounter / total ;
        float relFrequencyOfFive = fiveCounter / total ;
        float relFrequencyOfSix = sixCounter / total ;
        float relFrequencyOfSeven = sevenCounter / total ;
        float relFrequencyOfEight = eightCounter / total ;
        float relFrequencyOfNine = nineCounter / total ;


        System.out.println("\n");

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        System.out.println("--------------------------------------------");
        System.out.println("Digits"+"\t"+"Frequency"+"\t"+"Relative Frequency");

        System.out.println("--------------------------------------------");
        System.out.println("   0  "+"\t"+"\t"+ zeroCounter + "\t"+"\t"+"\t"+ df.format(relFrequencyOfZero));
        System.out.println("   1  "+"\t"+"\t"+ oneCounter +"\t"+"\t"+"\t"+ df.format(relFrequencyOfOne));
        System.out.println("   2  "+"\t"+"\t"+ twoCounter +"\t"+"\t"+"\t"+ df.format(relFrequencyOfTwo));
        System.out.println("   3  "+"\t"+"\t"+ threeCounter +"\t"+"\t"+"\t"+ df.format(relFrequencyOfThree));
        System.out.println("   4  "+"\t"+"\t"+ fourCounter +"\t"+"\t"+"\t"+ df.format(relFrequencyOfFour));
        System.out.println("   5  "+"\t"+"\t"+ fiveCounter +"\t"+"\t"+"\t"+ df.format(relFrequencyOfFive));
        System.out.println("   6  "+"\t"+"\t"+ sixCounter +"\t"+"\t"+"\t"+ df.format(relFrequencyOfSix));
        System.out.println("   7  "+"\t"+"\t"+ sevenCounter +"\t"+"\t"+"\t"+ df.format(relFrequencyOfSeven));
        System.out.println("   8  "+"\t"+"\t"+ eightCounter +"\t"+"\t"+"\t"+ df.format(relFrequencyOfEight));
        System.out.println("   9  "+"\t"+"\t"+ nineCounter +"\t"+"\t"+"\t"+ df.format(relFrequencyOfNine));

    }

}
