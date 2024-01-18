public class search {
    public static void main(String[] args) {
        int[] a = {4, 2, 9, -3, 5, 1,9};
        int target=7;
        System.out.println("Target value is " + target);
        int count=0;
        for (int i = 0; i <a.length; i++) {
            if(a[i]==target)
            {
                System.out.println("Target found at index " + i);
                count++;
            }
        }
        if(count==0)
            System.out.println("Target not found at index " );

    }

}
