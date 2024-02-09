import java.util.Scanner;
public class revil {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r1,r2,i,num,count;
        System.out.print("Enter the range: ");
        r1=sc.nextInt();
        r2=sc.nextInt();
        for(i=r1;i<=r2;i++){
            num=i;
            count=0;
            while(num!=0){
                if(num%2==1){
                    count+=1;
                }
                num/=2;
            }
            if(count%2==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    
}
