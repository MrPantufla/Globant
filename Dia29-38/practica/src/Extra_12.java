import java.util.Scanner;

public class Extra_12 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        String auxi, auxj, auxk;

        for (int i=0; i<10; i++) {
            for(int j=0; j<10; j++){
                for(int k=0; k<10; k++){
                    auxi="" + i;
                    auxj="" + j;
                    auxk="" + k;

                    if(auxi.equals("3")){
                        auxi="E";
                    }

                    if(auxj.equals("3")){
                        auxj="E";
                    }

                    if(auxk.equals("3")){
                        auxk="E";
                    }

                    System.out.println(auxi + "-" + auxj + "-" + auxk);
                }
            }
        }
    }
}
