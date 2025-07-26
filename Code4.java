import java.util.*;
public class Code4 {
    public static void main(String[]args){
        //Sort 0s,1s,2s without sorting algo
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter only 0s,1s,2s: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            if(a[i]==0){
                b[c++]=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==1){
                b[c++]=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==2){
                b[c++]=a[i];
            }
        }
        System.out.println("The Sorted Array: ");
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}
