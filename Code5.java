import java.util.*;
public class Code5 {
    public static void main(String[]args){
        //All negatives in one side
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the negative and positive elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
