public class avgofarray {
    public static void main(String[] args) {
        int[] n=new int[]{2,5,3,9,6};
        int sum=0;
        for(int j=0;j<n.length;j++){
            sum+=n[j];

        }
        System.out.print("The avg of Elements is "+sum/n.length);
    }
    
}
