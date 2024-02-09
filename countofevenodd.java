import java.util.Scanner;
public class countofevenodd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find out:");
        int num=sc.nextInt();
        int count=0,count1=0,rem=0;
        while(num!=0){
            rem=num%10;
            num/=10;
            if(rem==1){
                count++;
            }
            if(rem==0){
                count1++;
            }
        }
        System.out.println("The no of 1's is :"+count);
        System.out.println("The number of 0's is: "+count1);
    }
    
}
