import java.util.Scanner;
public class nperfectsquare {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,num=1,c=0,letest=0,rangeno,count=0;
        System.out.print("Enter the rangeno: ");
        rangeno=sc.nextInt();
        while(c!=rangeno){
            count=0;
            for(i=1;i<=num;i++){
                if(num==i*i){
                    count=1;
                    break;
                }
            }
            if(count==1){
                c++;
                letest=num;
            }
            num=num+1;

        }
        System.out.print("The prime number range is "+letest);
        sc.close();
    }
    
}
