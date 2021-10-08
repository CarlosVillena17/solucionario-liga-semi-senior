import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Character> p=new Stack<>();
        String cadena;
        char [] str;
        cadena=sc.next();
         str=cadena.toCharArray();
        for(int i=0; i< str.length; i++){
            if(p.empty()){
                p.push( str[i]);
            }else if(p.peek()=='(' &&  str[i]==')'){
                p.pop();
            }else{
                p.push( str[i]);
            }
        }

        if(p.empty()){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }

    }

}