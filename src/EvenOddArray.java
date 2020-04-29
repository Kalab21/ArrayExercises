
public class EvenOddArray {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int ss[]=new int[10];
        int odd[]=new int[10];
        int i;
        int k;

        for( i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                ss[i]=arr[i];
                System.out.print( "" +ss[i]  );

                System.out.print("  ");
            }

            if((arr[i]%2)!=0)
            {
                odd[i]=arr[i];

                System.out.print(""  +odd[i]);
                System.out.print(" ");
            }else
            {
                System.out.println (" ");
            }
        }
    }
}
