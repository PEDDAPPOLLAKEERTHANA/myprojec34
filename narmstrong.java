import java.util.Scanner;
public class narmstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rangeno,num=1,num1,num2,rem=0,res=0,c=0,letest=0;
        System.out.print("Enter the range number: ");
        rangeno=sc.nextInt();
        while(c!=rangeno)
        {
            //num2=num;
            num1=num;
            num2=num;
            res=0;
            while(num1!=0){
                rem=num1%10;
                res+=rem*rem*rem;
                num1/=10;
            }
            if(res==num2){
                c++;
                letest=num;
            }
            num=num+1;
        }
        System.out.print("The Armstrong range number is "+letest);
        sc.close();

    }
    
}
