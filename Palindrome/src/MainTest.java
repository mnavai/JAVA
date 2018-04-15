//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class MainTest {
//
//
//    @Test
//    void testMymethod(){
//        Assertions.assertEquals("dede", "dede");
//    }
//}


import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import sun.jvm.hotspot.utilities.Assert;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


public class MainTest{

    Palindrome palindrome = new Palindrome();


    @Test
    public void testcase1IsPalindromeWordLevel(){
        palindrome.finalString = "dewdew dewdewihdeh";
        palindrome.originalString = "dewdew dewdewihdeh";
        Boolean returnedValue = palindrome.isPalindromeWordLevel();
        assertFalse(returnedValue);
    }

    @Test
    public void test_case2_IsPalindromeWordLevel()
    {
        palindrome.finalString = "maryram hgh maryram";
        palindrome.originalString = "maryram hgh maryram";
        boolean returValue = palindrome.isPalindromeWordLevel();
        assertTrue(returValue);
    }

}