public class Example{
    public static void main(String[] args){
        System.out.println("Starting");
        
        try{
            int num1= Integer.parseInt(args[0]);
            int num2= Integer.parseInt(args[1]);

            System.out.println("Division");
            double result= num1/num2;
            System.out.println(result);
        }catch(Exception e){
            System.out.println("Error!!");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This is finally block");
        }
       
       
        System.out.println("Ending");

    }
}