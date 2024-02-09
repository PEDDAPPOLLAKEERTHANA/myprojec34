import java.util.Scanner;
public class happy {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,sum=0,rem=0;
        System.out.print("Enter a number to find happy or not:");
        num=sc.nextInt();
        while(sum!=1&&sum!=4){
            sum=0;
            while(num!=0){
                rem=num%10;
                sum=rem*rem+sum;
                num/=10;
            }
            num=sum;
        }
        sc.close();
        if(sum==1){
                 System.out.println("It is a happy number");
        }
        else{
            System.out.println("It is not a happy number");
        }
    }
}
