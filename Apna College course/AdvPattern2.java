public class AdvPattern2 {
    public static void main(String[] args) {
        int n=5;

        //outer
        for(int i=1;i<=n;i++){
            //spaces
            int space=n-i;
            while(space>0){
                System.out.print(" ");
                space--;
            }
            // printing star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
