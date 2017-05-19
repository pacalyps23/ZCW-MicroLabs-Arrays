package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    public String printArray(String[] inputArray)
    {
        String output="*** Output ***\n";
        for(int i = 0; i < inputArray.length; i++)
        {
            output = output.concat(inputArray[i]+"\n");
        }
        return output.trim();
    }

    public String lastElement(String[] inputArray)
    {
        String output="*** Output ***\n";
        output = output.concat(inputArray[inputArray.length-1]);
        return  output;
    }

    //TODO Define the method lastButOne
    public String lastButOneElement(String[] inputArray)
    {
        String output="*** Output ***\n";
        output = output.concat(inputArray[inputArray.length-2]);
        return  output;
    }

    //TODO Define the method reverse
    public String reverseAnArray(String[] inputArray)
    {
        int length = inputArray.length;
        String output="*** Output ***\n";
        for(int i = 0; i < length; i++)
        {
            output = output.concat(inputArray[length-i-1]+"\n");
        }
        return output.trim();
    }

    //TODO Define the method isPalindrome
    public boolean isPalindrome(String[] inputArray)
    {
        int length = inputArray.length / 2;

        for(int i = 0; i < length; i++)
        {
            if(inputArray[i] != inputArray[inputArray.length-1-i])
            {
                return false;
            }
        }
        return true;
    }

    //TODO Define the method compress
    public String compress(int [] inputArray)
    {
        String output = "";
        for(int i = 0; i < inputArray.length; i++)
        {
            while(inputArray[i] != inputArray[i+1])
            {
                output=output.concat(inputArray[i]+"\n");
            }
        }
        return output.trim();
    }

    //TODO Define the method pack
    public String duplicates(char [] inputArray)
    {
        String output = "";
        for(int i = 0; i < inputArray.length-1; i++)
        {
            if(inputArray[i] != inputArray[i+1])
            {
                output=output.concat(inputArray[i]+",");
            }
            else
            {
                output =  output.concat(inputArray[i] +"");
            }

        }
        return output.concat(inputArray[inputArray.length-1]+"").trim();
    }


}
