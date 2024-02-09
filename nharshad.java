import java.util.Scanner;
public class nharshad {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=1,num1,num2,i,rem=0,res=0,rangeno,c=0,letest=0;
        System.out.print("Enter the rane no: ");
        rangeno=sc.nextInt();
        while(c!=rangeno){
            num1=num;
            num2=num;
            res=0;
            while(num1!=0){
                rem=num1%10;
                res=res+rem;
                num1/=10;
            }
            if(num2%res==0){
                c++;
                letest=num;

            }
            num=num+1;
        }
        System.out.print("The range number is "+letest);
    }
    
}
