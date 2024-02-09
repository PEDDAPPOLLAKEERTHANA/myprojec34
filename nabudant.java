import java.util.Scanner;
public class nabudant {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rangeno,i,num=1,num2,num1,c=0,letest=0;
        System.out.print("Enter the range number: ");
        rangeno=sc.nextInt();
        while(c!=rangeno){
            num1=num;
            num2=0;
            for(i=1;i<num1;i++){
                if(num%i==0){
                    num2+=i;
                }
            }
            if(num2>num1){
                c++;
                letest=num;
            }
            num=num+1;
        }
        System.out.print("The range abudandant number is "+letest);
        sc.close();
    }
    
}
