import java.util.Scanner;
public class rautomorphic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r1,r2,num,num1,i,j,flag=0;
        r1=sc.nextInt();
        r2=sc.nextInt();
        for(i=r1;i<=r2;i++){
            num=i;
            num1=num*num;
            flag=0;
            while(num>0){
                //flag=0;
                if(num%10!=num1%10){
                    flag=1;
                    break;
                }
                num/=10;
                num1/=10;
            }
            if(flag==0){
                System.out.print(i+" ");
            }

        
        }
        sc.close();

    }
    
}
