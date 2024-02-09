import java.util.Scanner;
public class generic { 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rem=0,num2,sum=0;
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        while(num!=0){
        if(num<10){
            System.out.print(num);
            break;
    
        }
        
        while(num>=10)
        {
        
            for(sum=0;num>0;num/=10)
            {
                
                rem=num%10;
                sum=sum+rem;
                //num/=10;


            }
        
            if(sum>=10){
                num=sum;
                
             
            }
            else{   
                System.out.println(sum);
            }
            
        }
        }
        

    }
    
}

