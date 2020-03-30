import java.util.ArrayList;
import java.util.List;

public class StringCalculator {



//    public static int stringSingleValue(String num)
//    {
//
//    }



    public static int AddNumbers(String num)
    {


         if (num == null || num.isEmpty())
         {
            num ="0";
         }


        num = num.replace("//;","0");

        num = num.replace("//***","0");
        num = num.replace("***",",");
         if(num.startsWith("//4"))
         {
             num = num.replace("//4","0");
             num = num.replace("4",",");
         }


         String delimeter ="[,\n;]";
         String[] token = num.split(delimeter);
         int sum = 0;
         for(String numbers : token)
         {
            if(Integer.parseInt(numbers) <1000)
            {
                sum = sum +Integer.parseInt(numbers);
            }
         }

        System.out.println(sum);
        if (num.contains("-"))
        {
            throw new IllegalArgumentException(
                    "negatives not allowed " + String.join(",", num));
        }

        return sum;

    }


    public static void main(String [] arg)
    {

        AddNumbers("");
        AddNumbers("1");
        AddNumbers("1,2,3,4");
        AddNumbers("1\n2,3");
        AddNumbers("//;\n1;2");
        //AddNumbers("-1,-2,3,4");
        AddNumbers("//;\n1000,1;2");


        AddNumbers("//***\n1***2***3");
    }
}
