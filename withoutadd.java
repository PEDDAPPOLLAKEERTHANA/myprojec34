import java.util.Scanner;
public class withoutadd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter a number1 :");
        num1=sc.nextInt();
        System.out.print("Enter a number2 :");
        num2=sc.nextInt();
        while(num2!=0){
            int carry=num1&num2;
            num1=num1^num2;
            num2=carry<<1;
        }
        System.out.print("The addition of numbers is:"+num1);
    }
    
}
