import java.util.*;


public class scratch
{
    // declaring and initializing some variables

    private static int x = 3;
    private static String y = "hello";
    private static double z = 9.8;

    public static void main(String[] args)
    {
        // printing the variables

        System.out.println("x: " + Integer.toString(x) +" " + "y: " + get_y() + " "+ "z: " + String.valueOf(z));
        // a list (make an array in java)
        int nums[] = {3,6,-1,2};
        for (int num : nums)
            System.out.println(num);
        System.out.println();
        //call a function
        int numFound = char_count(y,'l');
        System.out.println("found:" + numFound);
        for(int i = 1; i <= 10; i++)
            System.out.println(i);
        System.out.println();
    }
    public static int char_count(String s, char c)
    {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                count += 1;
        }
        return count;
    }
    public static int get_x() {
        return x;
    }
    public static String get_y() {
        return y;
    }
    public static double get_z() {
        return z;
    }
}