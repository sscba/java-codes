public class Pattern8 {
    public static void main(String[] args) {
        int n=5;

        //outer
        for(int i=n;i>=1;i--){
            //inner
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
