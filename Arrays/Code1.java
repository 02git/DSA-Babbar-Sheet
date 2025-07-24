import java.util.*;
public class Code1 {
    public static void main(String[]args){
        //This is a program to reverse a given array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int start=0,end=a.length-1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
