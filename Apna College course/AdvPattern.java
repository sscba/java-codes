public class AdvPattern {
    public static void main(String[] args) {
        int n=5;

        //upper
        for(int i=1;i<=n;i++){
            
            //Part-1
            //1st triangle of *
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //printing spaces
            int spaces= 2*(n-i);
            while(spaces>0){
                System.out.print(" ");
                spaces--;
            }

            //2nd * triangle
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        //lower
        for(int i=n;i>0;i--){
            
          
            //1st triangle of *
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //printing spaces
            int spaces= 2*(n-i);
            while(spaces>0){
                System.out.print(" ");
                spaces--;
            }

            //2nd * triangle
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
