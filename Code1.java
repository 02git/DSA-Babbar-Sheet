import java.util.*;
public class Code1 {
    public static void main(String[]args){
        //Array Reverse
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b=0,c=a.length-1;
        while(b<c){
            int temp=a[b];
            a[b]=a[c];
            a[c]=temp;

            b++;
            c--;
        }
        System.out.println("Reversed array: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
