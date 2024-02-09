import java.util.Scanner;
public class loops {
    public static void main(String args[]){
        int i,j,num,num1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
        for(i=0;i<num;i++){
            for(j=0;j<num;j++){
                if(i==0||j==0||i==num-1||j==num-1){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
            
                }
            }
            System.out.println();
        }
    }
    
}
