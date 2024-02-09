import java.util.Scanner;
public class nneon {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=1,num1,num2,c=0,letest=0,rem=0;
        System.out.print("Enter the range number: ");
        int rangeno=sc.nextInt();
        while(c!=rangeno){
            num1=num;
            num2=num1*num1;
            int res=0;
            while(num2!=0){
                rem=num2%10;
                res+=rem;
                num2/=10;
            }
            if(num1==res){
                c++;
                letest=num;
            }
            num=num+1;
        }
        System.out.print("The range number is "+letest);
        sc.close();
   }
}
