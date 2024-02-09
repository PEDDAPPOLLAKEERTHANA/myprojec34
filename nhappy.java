import java.util.Scanner;
public class nhappy {
    public static void main(String args[]){
        int c=0,num=1,num1,rem=0,letest=0,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range no:");
        int rangeno=sc.nextInt();
        while(c!=rangeno){
            num1=num;
            sum=0;
            while(sum!=1&&sum!=4){
                sum=0;
                while(num1!=0){
                    rem=num1%10;
                    sum+=rem*rem;
                    num1/=10;
                }
                num1=sum;
            }
            if(sum==1){
                c++;
                letest=num;
            }
            num=num+1;
            
        }
        System.out.print("The range number is: "+letest);
        sc.close();

    }
    
}
