import java.util.Scanner;
//import java.lang.Math;
public class rdisarium {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r1,r2,num,i,num1,rem=0,res=0,count;
        System.out.print("Enter the range: ");
        r1=sc.nextInt();
        r2=sc.nextInt();
        for(i=r1;i<=r2;i++){
            num=i;
            num1=num;
            count=0;
            res=0;
            while(num1!=0){
                count+=1;
                num1/=10;
            }
            while(num!=0){
                rem=num%10;
                res+=Math.pow(rem,count);
                count--;
                num/=10;
            }
            if(res==i){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    
}
