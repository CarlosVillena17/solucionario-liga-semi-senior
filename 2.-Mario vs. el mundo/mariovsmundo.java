import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int escenarios;
        int n;

        escenarios=sc.nextInt();
        for(int i=0; i<escenarios; i++){
            n=sc.nextInt();
            int []a=new int[n];
            int brincosAltos=0;
            int brincosBajos=0;
            for(int j=0; j<a.length; j++){
                a[j]=sc.nextInt();
            }
            for(int k=0; k<a.length-1; k++){
                if(a[k]<a[k+1]){
                    brincosAltos++;
                }else if(a[k]>a[k+1]){
                    brincosBajos++;
                }
            }
            System.out.print("\nEscenario "+(i+1)+": "+brincosAltos+" "+brincosBajos);
        }
    }
}