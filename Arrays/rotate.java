import java.util.Scanner;
public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the size of the array:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }


        int rev[] = new int[n];
        int revcount=n-1;
        for(int i=0;i<arr.length;i++)
        {
            rev[revcount]=arr[i];
            revcount--;

        }
        System.out.println("Printing reverse array");
        for(int j=0;j<rev.length;j++)
        {
            System.out.print(rev[j]+" ");
        }

        int rotarr[] = new int[n];
        System.out.println("enter the x position value");
        int x = sc.nextInt();
        int in=0;
        int bn=0;
        for(int k=0;k<n;k++)
        {
            if(k<x)
            {
                rotarr[k]=rev[in];
                in++;
                System.out.println(rotarr[k]);
            }
            else
            {
                rotarr[k]=arr[bn];
                bn++;
                System.out.println(rotarr[k]);
            }
        }




    }

}
