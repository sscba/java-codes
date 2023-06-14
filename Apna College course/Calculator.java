import java.util.*;

class Calculator{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        String o = sc.next();
        char op= o.charAt(0);
        int result= 0;

        switch (op) {
            case '+': result= a+b;
                break;
            case '-': result = a-b;
                break;
            case '*': result= a*b;
                break;
            case '/': result= a/b;
                break;
            case '%': result= a%b;
                break;
            default:
                break;
        }

        System.out.println(result);

    }
}