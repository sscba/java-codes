public class AdvPattern3 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){
            //spaces
            int space= n-i;
            while(space>0){
                System.out.print(" "); 
                space--; 
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
