import java.util.Scanner;
    public class rharshad{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int r1,r2,num,rem=0,res=0,i;
            System.out.print("Enter the range:");
            r1=sc.nextInt();
            r2=sc.nextInt();
            
            for(i=r1;i<=r2;i++){
                num=i;
                res=0;
                while(num!=0){
                    rem=num%10;
                    res=res+rem;
                    num/=10;
                }
                if(i%res==0){
                    System.out.print(i+" ");
                }
            }
            sc.close();
        }
    }