import java.util.*;
public class Code2 {
    public static void main(String[]args){
        //A program to find the minimum and maximum element in an array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0],max=a[0];
        for(int i=0;i<n;i++){
            if(a[i]<min)
            min=a[i];
            else if(a[i]>max)
            max=a[i];
        }
        System.out.println("Minimum "+min+"\nMaximum "+max);
    }
}
