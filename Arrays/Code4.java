import java.util.*;
public class Code4 {
    public static void main(String[]args){
        //To arrange 0,1,2 without sorting in an array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length: ");
        int n=sc.nextInt();
        System.out.println("Enter only 0s, 1s, 2s: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                b[c]=a[i];
                c++;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==1){
                b[c]=a[i];
                c++;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==2){
                b[c]=a[i];
                c++;
            }
        }
        System.out.println("Sorted: ");
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}
