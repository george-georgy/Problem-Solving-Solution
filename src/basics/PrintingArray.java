package basics;

public class PrintingArray {
    public static void main(String[] args)
    {
        String[] vals = {"-5", "Java", "3.8"};
        System.out.println("One way of printing an array: ");
        for (int i = 0; i < vals.length; i++)
        {
            System.out.println(vals[i]);
        }

        System.out.println("Another way of printing an array: ");
        for (String s: vals)
        {
            System.out.println(s);
        }
    }
}
