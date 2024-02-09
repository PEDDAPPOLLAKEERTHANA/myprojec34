import java.util.Scanner;
import java.util.Arrays;
public class revarrayString
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n=sc.nextInt();
       // sc.nextLine();
        String[] arr=new String[n];
       // sc.nextInt();
        System.out.print("Enter the array elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The reverse of elements are :");
        rev(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    static void rev(String[] arr)
    {
        int start=0;
        int end=arr.length - 1;
        while(start<end){   
            swap(arr,start,end);
            start++;
            end--;
        }
        
    }
    static void swap(String[] arr,int index1,int index2){
        String temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

} 