public class elesuminarray {
public static void main(String args[]){
    
    int[] n=new int[]{2,5,1,9,6};
    int sum=0;
    for(int j=0;j<n.length;j++){
        sum+=n[j];
    }
    System.out.println("The sum of elements in array is "+sum);

}
}