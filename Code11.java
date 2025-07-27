import java.util.*;
public class Code11 {
    public static void main(String[]args){
        //Print repeating numbers from an array
        System.out.println("Enter the length of the array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        System.out.println("The duplicate elements are: ");
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1])
            System.out.print(a[i]+" ");
        }
    }
}
