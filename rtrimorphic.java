import java.util.Scanner;
public class rtrimorphic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r1,r2,num,num1,count=0,i;
        System.out.print("Enter the range: ");
        r1=sc.nextInt();
        r2=sc.nextInt();
        for(i=r1;i<=r2;i++){
            num=i;
            num1=num*num*num;
            count=0;
            while(num!=0){
                //count=0;
                if(num%10!=num1%10){
                    count=1;
                    break;
                }
                num/=10;
                num1/=10;
            }
            if(count==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    
}
