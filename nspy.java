import java.util.Scanner;
public class nspy {
    public static void main(String args[]){
        int num=1,num1,c=0,letest=0,rem=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range number: ");
        int rangeno=sc.nextInt();
        while(c!=rangeno){
            num1=num;
            int res=0,prod=1;
    
            while(num1!=0){
                rem=num1%10;
                res=res+rem;
                prod=prod*rem;
                num1/=10;
            }
            if(prod==res){
                c++;
                letest=num;
            }
            num=num+1;
            
        }
        System.out.print("The range number is "+letest);
        sc.close();
    }
    
}
