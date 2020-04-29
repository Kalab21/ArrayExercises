import java.util.HashSet;

public class RemoveDuplicates{
    static int []array ={4,3,4,3,5,2,4,5,6,6};
    static HashSet list = new HashSet();

      public static void main (String [] args)
    {
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
                    System.out.println(list);
                } }
