public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        

        //outer
        for(int i=1;i<=n;i++){
            //inner
            for(int j=1;j<=i;j++){
                int sum= i+j;
                if(sum%2==0){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
