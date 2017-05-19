package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest()
    {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" + "Mushrooms";

        //: When
        String actual = arrayParty.lastElement(breakfast);

        //: Then
        Assert.assertEquals("Last element is mushrooms", expected, actual);
    }

    //TODO Define the method lastButOneTest
    @Test
    public void lastButOneElementTest()
    {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" + "Tomatoes";

        //: When
        String actual = arrayParty.lastButOneElement(breakfast);

        //: Then
        Assert.assertEquals("Last element is mushrooms", expected, actual);
    }

    //TODO Define the method reverseTest
    @Test
    public void reverseAnArrayTest()
    {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +"Mushrooms\n" + "Tomatoes\n" + "Bacon\n" +
                "Beans\n" + "Eggs\n" + "Sausage";

        //: When
        String actual = arrayParty.reverseAnArray(breakfast);

        //: Then
        Assert.assertEquals("Last element is mushrooms", expected, actual);
    }
    //TODO Define the method isPalindromeTest
    @Test
    public void isPalindromeTest()
    {
        //given
        ArrayParty arrayParty = new ArrayParty();
        String [] palindromic = {"Sausage", "Eggs", "Beans",
                "Beans", "Eggs", "Sausage"};
        boolean expected = true;

        //when
        boolean actual = arrayParty.isPalindrome(palindromic);

        //then
        Assert.assertEquals("check palindrome", expected, actual);

    }

    //TODO Define the method compressTest
    @Test
    public void consecutiveDuplicates()
    {
        //given
        ArrayParty arrayParty = new ArrayParty();
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        String expected = "1\n3\n2\n1\n4";

        //when
        String actual = arrayParty.compress(nums);

        //then
        Assert.assertEquals("compressed", expected, actual);
    }


    //TODO Define the method packTest
    @Test
    public void duplicatesTest()
    {
        //given
        ArrayParty party = new ArrayParty();
        char [] letters = {'a','a','a','a','b','c','c','a','a','d',

                'e','e','e','e'};
        String expected = "aaaa,b,cc,aa,d,eeee";

        //when
        String actual = party.duplicates(letters);

        //then
        Assert.assertEquals("String of duplicates in sets", expected, actual);

    }


}
