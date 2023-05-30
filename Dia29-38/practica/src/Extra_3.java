import java.util.Scanner;

public class Extra_3{
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        String a=leer.nextLine();

        if(a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")){
            System.out.println("Es vocal");
        }
        else{
            System.out.println("No es vocal");
        }
    }
}
