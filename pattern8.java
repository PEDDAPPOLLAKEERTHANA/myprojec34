import java.util.Scanner;
public class pattern8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
          
            System.out.println();
            
        
        }
        sc.close();
    }
    
}
