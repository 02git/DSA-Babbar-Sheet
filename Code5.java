import java.util.*;
public class Code5 {
    public static void main(String[]args){
        //Move all negatives to one side, and positives to another
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n=sc.nextInt();
        System.out.println("Enter negative numbers and positive numbers: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        int c=n-1,d=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                b[d]=a[i];
                d++;
            }
            if(a[i]>0){
                b[c]=a[i];
                c--;
            }
        }
        System.out.println("The Sorted Array: ");
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(b[j]>b[j+1]){
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}
