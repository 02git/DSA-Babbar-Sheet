import java.util.*;
public class code6 {
    static boolean isInArray(int[] arr, int size, int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) return true;
        }
        return false;
    }
        public static void main(String[]args){
        //Find out Union and intersection between two unsorted arrays
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of first array: ");
        int n1=sc.nextInt();
        System.out.println("Enter the elements of first array: ");
        int a[]=new int[n1];
        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the length of second array: ");
        int n2=sc.nextInt();
        System.out.println("Enter the elements of second array: ");
        int b[]=new int[n2];
        for(int i=0;i<n2;i++){
            b[i]=sc.nextInt();
        }
        //Intersection
        System.out.println("The Intersection of two arrays: ");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
            if(a[i]==b[j]){
                System.out.print(a[i]+" ");
            }
          }  
        }
        //Union
        System.out.println("\nThe Union of two arrays: ");
        int size=0;
        int union[]=new int[n1+n2];
        for (int i = 0; i < n1; i++) {
            if (!isInArray(union, size, a[i])) {
                union[size++] = a[i];
            }
        }
         for (int i = 0; i < n2; i++) {
            if (!isInArray(union, size, b[i])) {
                union[size++] = b[i];
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(union[i]+" ");
        }
    }
}
