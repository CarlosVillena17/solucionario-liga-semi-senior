import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> p=new Stack<Integer>();
        int n;
        int num;
        int n1,n2;
        n=sc.nextInt();
        String operacion;
        for(int i=0; i<n; i++){
            operacion=sc.next();
            if(operacion.equals("AGREGA")){
                num=sc.nextInt();
                p.push(num);
            }
            if(operacion.equals("CONSUME")){
                n1=p.peek();
                p.pop();
                n2=p.peek();
                p.pop();
                p.push(n1+n2);
            }
            if(operacion.equals("IMPRIME")){
                System.out.println(p.peek());
            }
        }

    }

}