import java.util.Scanner;
public class ndisarium {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count=0,c=0,letest=0,num=1,num1,num2,rem=0;
        System.out.print("Enter the range number: ");
        int rangeno=sc.nextInt();
        while(c!=rangeno){
            num1=num;
            num2=num1;
            count=0;
            int res=0;
            while(num1!=0){
                count++;
                num1/=10;
            }
            while(num2!=0){
                rem=num2%10;
                res+=Math.pow(rem,count);
                num2/=10;
                count--;

            }
            if(num==res){
                c++;
                letest=num;
            }
            num=num+1;
        }
        System.out.print("The range number is "+letest);
        sc.close();
    }
    
}
