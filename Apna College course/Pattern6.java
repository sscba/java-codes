public class Pattern6 {
    public static void main(String[] args) {
        int n=4;

        //outer
        for(int i=1;i<=n;i++){
            //inner
            //printing space
            int space= n-i;
            while(space>0){
                System.out.print(" ");
                space--;
            }
            //printing star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
