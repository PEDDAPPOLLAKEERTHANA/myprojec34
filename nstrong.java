import java.util.Scanner;
public class nstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rangeno,i,num=1,num1,num2,rem=0,res=0,fact=1;
        int c=0,letest=0;
        System.out.print("Enter the range number: ");
        rangeno=sc.nextInt();
        while(c!=rangeno){
            res=0;
            num1=num;
            fact=1;
            num2=num;
            while(num1!=0){
                rem=num1%10;
                fact=1;
                for(i=1;i<=rem;i++){
                    fact=fact*i;
                }
                res+=fact;
                num1/=10;
            }
            if(num2==res){
                c++;
                letest=num;
            }
            num=num+1;
        }
        System.out.print("The strong rangeno is "+letest);
        sc.close();

    }
    
}
