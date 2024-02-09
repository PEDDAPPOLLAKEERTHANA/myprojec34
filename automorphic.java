import java.util.Scanner;
public class automorphic {
    public static void main(String args[]){
        int num,sqr;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        sqr=num*num;
        int flag=0;
        while(num!=0){
            if(num%10!=sqr%10){
                flag=1;
                break;
            }
            num=num/10;
            sqr=sqr/10;
            
        }
        if(flag==0){
                System.out.println("Given number is Automorphic");
        }
        else{
            System.out.println("Given number is not a automaorphic number:");
        }
     }
}
    
