import java.util.Scanner;

public class Extra_2{
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        int a,b,c,d,aux;
        a=leer.nextInt();
        b=leer.nextInt();
        c=leer.nextInt();
        d=leer.nextInt();
        
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;

        System.out.println("A=" + a);
        System.out.println("B=" + b);
        System.out.println("C=" + c);
        System.out.println("D=" + d);
    }
}
