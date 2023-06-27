package Services;
import Objects.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    Ahorcado a = new Ahorcado();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Ahorcado crearJuego(){
        System.out.println("Ingresar la palabra");
        String palabra=leer.nextLine();
        String arrayPalabra[] = new String [palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) {
            arrayPalabra[i]=palabra.substring(i,i+1);
        }
        a.setPalabra(arrayPalabra);
        
        System.out.println("Ingresar cantidad de jugadas maximas");
        a.setJugadasMaximas(leer.nextInt());
        leer.nextLine();
        a.setJugadasRealizadas(0);
        a.setLetrasEncontradas(0);
        
        return a;
    }
    
    public void longitud(){
        System.out.println("La palabra tiene " + a.getPalabra().length + " caracteres"); 
    }
    
    public void buscar(String letra){
        boolean band=false;
        int i;
        
        for(i=0; i<a.getPalabra().length; i++){
            if(letra.equals(a.getPalabra()[i])){
                band=true;
                break;
            }
        }
        
        if(band==true){
            for (int j = i; j < (a.getPalabra().length)-1; j++) {
                a.getPalabra()[j]=a.getPalabra()[j+1];
            }
            a.setLetrasEncontradas(a.getLetrasEncontradas()+1);
            
            int longitud=a.getPalabra().length;
            String copiaDePalabra[]=new String[longitud];
            copiaDePalabra=a.getPalabra();
            for (int j = a.getPalabra().length-1; j > (a.getPalabra().length-a.getLetrasEncontradas()); j--) {
                copiaDePalabra[j]="%";
            }
            a.setPalabra(copiaDePalabra);
            System.out.println("La letra se encuentra en la palabra");
        }
        else{
            a.setJugadasRealizadas(a.getJugadasRealizadas()+1);
            System.out.println("La letra no se encuentra en la palabra");
        }
    }
    
    public void encontradas(String letra){
        System.out.println("Numero de letras encontradas: " + a.getLetrasEncontradas() + " y numero de letras faltantes: " + (a.getPalabra().length-a.getLetrasEncontradas()));
    }
    
    public void intentos(){
        System.out.println("Quedan " + (a.getJugadasMaximas()-a.getJugadasRealizadas()) + " intentos");
        System.out.println("");
    }
    
    public void juego(){
        boolean band=false;
        crearJuego();
        while((a.getJugadasRealizadas()<a.getJugadasMaximas()) && (a.getLetrasEncontradas()<a.getPalabra().length)){
            longitud();
            System.out.println("Ingrese una letra");
            String letra = leer.nextLine();
            buscar(letra);
            encontradas(letra);
            intentos();
            
            if(a.getLetrasEncontradas()==a.getPalabra().length){
                band=true;
            }
        }
        
        if(band){
            System.out.println("GANASTE, fin del juego");
        }
        else{
            System.out.println("PERDISTE, fin del juego");
        }
        
    }
}
