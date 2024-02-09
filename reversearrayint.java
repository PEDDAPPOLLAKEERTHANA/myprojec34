import java.util.Scanner;
//import java.util.Arrays;
public class reversearrayint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n=sc.nextInt();
        int[] name=new int[n];
        System.out.print("Enter array elements :");
        for(int i=0;i<name.length;i++){
            name[i]=sc.nextInt();
        }
        System.out.print("The array elements are:");
        for(int i=0;i<name.length;i++){
            System.out.print(name[i]+" ");
        }
        System.out.println();

        //System.out.println(Arrays.toString(name));
           for(int i=name.length-1;i>=0;i--){
            System.out.println(name[i]+" ");
           }
        
       
        
    }
}
