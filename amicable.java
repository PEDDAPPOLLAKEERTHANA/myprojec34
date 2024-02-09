import java.util.Scanner;
public class amicable {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1,num2,n1,n2,sum1=0,sum2=0,i,j,rem=0;
        System.out.print("Enter a number1 :");
        num1=sc.nextInt();
        System.out.print("Enter a number2 :");
        num2=sc.nextInt();
        n1=num1;
        n2=num2;

        for(i=1;i<=(num1/2);i++){
            if(num1%i==0){
                sum1+=i;
            }
            //num1/=i;
        }
        for(j=1;j<=(num2/2);j++){
            if(num2%j==0){
                sum2+=j;
            }
          //  num2/=j;
        }
        if(n1==sum2){
            if(n2==sum1){
                System.out.print("The given numbers is amicable");
            }
        }
        else{
            System.out.print("The given numbers are not ambicable pairs");
        }
    }
    
}
