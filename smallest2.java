import java.util.Scanner;
public class smallest2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,lar=0,rem=0;
        System.out.print("Enter a number :");
        num=sc.nextInt();
        int small=num%10;
        int sec_small=small;
        while(num!=0){
            rem=num%10;
            if(small>rem){
                sec_small=small;
                small=rem;
            }
            else if(rem<=sec_small){
                sec_small=rem;
            }
            num/=10;
        }
        System.out.print("The smallest digit is: "+sec_small);
    }
}

    


    
