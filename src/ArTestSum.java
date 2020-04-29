import java.util.Arrays;

public class ArTestSum {
    public static void main(String... args) {
        int[] ar1 = {1, 7, 6, 5, 9};
        int[] ar2 = {2, 7, 6, 3, 4};
        for(int i=0; i< ar1.length; i++){
            for(int j=0; j< ar2.length; j++){
                if ((ar1[i]+ar2[j]) ==13){
                    System.out.println("("+ ar1[i] +","+ar2[j]+")");
                }
            }

        }

    }
}