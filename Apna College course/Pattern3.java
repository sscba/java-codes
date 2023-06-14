public class Pattern3 {
    public static void main(String[] args) {
        int n=4;
        int m=5;

        //Approach 1
        // for(int i=1;i<=n;i++){
        //     if(i==1 || i==n){
        //         //print(* * * *)
        //         for(int j=1;j<=m;j++){
        //             System.out.print("*");
        //         }
        //     }
        //     else{
        //         //print(*   *)
        //         for(int j=1;j<=m;j++){
        //             if(j==1 || j== m){
        //                 System.out.print("*");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //         }
        //     }
        //     System.out.println();
        // }

        //Approach 2
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || j==m || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
