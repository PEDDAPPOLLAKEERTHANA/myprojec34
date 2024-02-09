import java.util.Scanner;
public class largest2 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,lar=0,rem=0,sec_lar=0;
        System.out.print("Enter a number :");
        num=sc.nextInt();
        while(num!=0){
            rem=num%10;
            if(lar<rem){
                sec_lar=lar;
                lar=rem;
            }
            else if(rem>=sec_lar){
                sec_lar=rem;
            }
            num/=10;
        }
        System.out.print("The largest digit is: "+sec_lar);
    }
}

    

