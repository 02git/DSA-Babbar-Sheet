import java.util.*;
public class Code3 {
    public static void main(String[]args){
        //find the kth max and min element in an array
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements: ");
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
        System.out.println("Enter the value of K: ");
        int k=sc.nextInt();
        System.out.println("The "+k+"th smallest element is: "+a[k-1]);
        System.out.println("The "+k+"th largest element is: "+a[(n)-k]);

    }
}
