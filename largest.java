import java.util.Scanner;
public class largest {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,lar=0,rem=0;
        System.out.print("Enter a number :");
        num=sc.nextInt();
        while(num!=0){
            rem=num%10;
            if(lar<rem){
                lar=rem;
            }
            num/=10;
        }
        System.out.print("The largest digit is: "+lar);
    }
}
