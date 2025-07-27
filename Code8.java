import java.util.*;
public class Code8 {
    //Maximum sub array sum
    static int Subarray(int[]arr){
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                res=Math.max(res,sum);
            }
        }
        return res;
    }
    public static void main(String[]args){
        System.out.println("Enter the length of the array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Maximum Subarray Sum: "+Subarray(a));
    }
}
