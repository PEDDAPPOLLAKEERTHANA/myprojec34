import java.util.Scanner;
public class ugly {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int x=0;
        while(num!=1){
            if(num%2==0 ){
                num/=2;
            }else if(num%3==0)
            {
                num/=3;
            }
            else if(num%5==0){
                num/=5;
            }
            else{
                System.out.print("It is not augly number");
                x=1;
                break;
            }
                

        }
        if(x==0){
            System.out.print("Ugly");
        }
    }
    
}
