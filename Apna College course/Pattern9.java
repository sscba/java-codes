public class Pattern9 {
    public static void main(String[] args) {
        int n=5;
        int count=1;

        //outer
        for(int i=1;i<=n;i++){
            //inner
            for(int j=1;j<=i;j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
