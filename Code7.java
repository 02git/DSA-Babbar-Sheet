import java.util.*;
public class Code7 {
    public static void main(String[]args){
        //Rotate Cyclically an array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int last=a[n-1];
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=last;
        System.out.println("Cyclically Rotated array: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    } 
}
