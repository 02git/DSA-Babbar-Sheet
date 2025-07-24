import java.util.*;
public class Code3 {
    public static void main(String[]args){
        //This is a program to find out the Kth smallest element
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Kth smallest element to find: ");
        int k=sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        if(k>0 && k<=n)
        System.out.println("\nThe "+k+"th smallest element is: "+a[k-1]);
    }
}
