import java.util.*;
public class Code2 {
    public static void main(String[]args){
        //Maximum and minimum element in an array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0],min=a[0];
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("The Maximum is: "+max);
        System.out.println("The Minimum is: "+min);
    }
}
