package Bad_Words;

import java.util.Locale;
import java.util.Scanner;

public class BadWords {
    public static String[] names = {"Stupid", "Idiot", "Non sense"};
    Scanner sc= new Scanner(System.in);
    String str= sc.nextLine();
    public void printNames(String [] namesArray)
    {
        for(int i = 0; i < namesArray.length; i++)
        {
            if(str.contains(names[i]) || str.contains((names[i]).toLowerCase(Locale.ROOT)))
            {
                str = str.replace(namesArray[i], "*****");
                str = str.replace(namesArray[i].toLowerCase(), "*****");
            }
        }
        System.out.print(str);
    }
    public static void main(String[] a)
    {
        System.out.print("Enter a string: ");
        BadWords namePrinter = new BadWords();
        namePrinter.printNames(namePrinter.names);
    }
}
