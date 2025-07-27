import java.util.*;
public class Code9 {
    //Minimize the maximum difference between heights
    static int getMinDiff(int a[],int k){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        int res=a[n-1]-a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]-k<0)
            continue;
            int minH=Math.min(a[0]+k,a[i]-k);
            int maxH=Math.max(a[i-1]+k,a[n-1]-k);
            res=Math.min(res,maxH-minH);
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
        System.out.println("Enter the value of K: ");
        int k=sc.nextInt();
        System.out.println("Minimum difference is: "+getMinDiff(a,k));
    }
}
