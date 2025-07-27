import java.util.*;
public class Code10 {
    public static void main(String[]args){
        //No.of Jumps to reach the end of the array
        System.out.println("Enter the length of the array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0,i=0;
        while(i<a.length){
            int n1=a[i];
            if(n1<=0){
                System.out.println("We can't go anywhere from this position");
                System.exit(0);
            }
            else{
                i=i+n1;
                c++;
            }
        }
        System.out.println("The number of steps needed is: "+c);
    }
}
