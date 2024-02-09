import java.util.Scanner;
public  class nmagic{
    public static void main(String args[]){
        int num=1,c=0,num1,num2,letest=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range number: ");
        int rangeno=sc.nextInt();
        while(c!=rangeno){
            num1=num;
            num2=0;
            int res=0,sum=0;
            while(num1!=0){
                rem=num1%10;
                sum=sum+rem;
                num1/=10;
            }
            num2=sum;
            while(num2!=0){
                rem=num2%10;
                res=res*10+rem;
                num2/=10;
            }
            if(res*sum==num){
                c++;
                letest=num;
            }
            num=num+1;
        }
        System.out.print("The range number is "+letest);
        sc.close();
    }
}