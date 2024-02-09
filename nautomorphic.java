import java.util.Scanner;
public class nautomorphic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=1,i,num1,c=0,letest=0,num2,count=0;
        System.out.print("Enter the range number:");
        int rangeno=sc.nextInt();
        while(c!=rangeno){
            count=0;
            num1=num;
            num2=num1*num1;
            while(num1>0)
            {
                if(num1%10!=num2%10)
                {
                    count++;
                    break;
                }
                num1/=10;
                num2/=10;
            }
            if(count==0){
                c++;
                letest=num;
            }
            num=num+1;
        }
        System.out.print("The range number is  "+letest);
        sc.close();
    }
    
}
