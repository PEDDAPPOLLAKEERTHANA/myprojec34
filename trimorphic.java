import java.util.Scanner;
public class trimorphic {
    public static void main(String args[]){
        int num,num1,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=sc.nextInt();
        num1=num*num*num;
        while(num!=0){
            if(num%10!=num1%10)
            {
                count=1;
                break;
            }
            num/=10;
            num1/=10;
        }
        if(count==0){
            System.out.println("It is a trimorphic number");
        }
        else{
            System.out.println("It is not a trimorphic number");
        }
        sc.close();

    }
    
}
