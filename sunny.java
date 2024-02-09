import java.util.Scanner;
public class sunny {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1;
        double root;
        System.out.print("Enter a number to check:");
        num1=sc.nextInt();
        root=Math.sqrt(num1+1);
        System.out.println(root);
        if((int)root==root)
        {
            System.out.println("It is a sunny");
        }
        else{
            System.out.println("It is not a sunny number");
        }
    }
    
}
