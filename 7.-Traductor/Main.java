import java.util.Hashtable;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> dic=new Hashtable<>();
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int clave, concepto;
        for(int i=0; i<n; i++){
            clave=sc.nextInt();
            concepto=sc.nextInt();
            dic.put(clave, concepto);
        }
        int cla;
        for(int i=0; i<m; i++){
            try{
                cla=sc.nextInt();
                if(!dic.get(cla).equals(null)){
                    System.out.println(dic.get(cla));
                }
            }catch (NullPointerException e){
                System.out.println("C?");
            }
        }

    }
}