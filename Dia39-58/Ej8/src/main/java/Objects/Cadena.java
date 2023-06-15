package Objects;

public class Cadena {
    private String cadena;
    private int longitud;

    public Cadena(String cadena) {
        this.cadena=cadena;
        this.longitud=cadena.length();
    }

    public String getCadena() {
        return cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    public int mostrarVocales(){
        int contador=0;
        for (int i = 0; i < this.longitud; i++) {
            String variable=cadena.substring(i, i+1);
            
            switch(variable){
                case "a":
                    contador++;
                    break;
                case "e":
                    contador++;
                    break;
                case "i":
                    contador++;
                    break;
                case "o":
                    contador++;
                    break;
                case "u":
                    contador++;
                    break;
                default:
            } 
        }
        return contador;
    }
    
    public void invertirFrase(){
        for (int i = this.longitud-1; i >= 0; i--) {
            System.out.print(cadena.substring(i,i+1));
        }
        System.out.println("");
    }
    
    public int vecesRepetido(String caracter){
        int contador=0;
        for (int i = 0; i < this.longitud; i++) {
            if(cadena.substring(i,i+1).equals(caracter)){
                contador++;
            }
        }
        return contador;
    }
    
    public void comprarLongitud(String frase){
        if(frase.length()>this.longitud){
            System.out.println("La nueva frase es más larga");
        }
        else if(frase.length()<this.longitud){
            System.out.println("La nueva frase es más corta");
        }
        else{
            System.out.println("Las frases tienen la misma longitud");
        }
    }
    
    public void unirFrases(String frase){
        System.out.println(this.cadena + frase);
    }
    
    public void reemplazar(String letra){
        for (int i = 0; i < this.longitud; i++) {
            if(this.cadena.substring(i,i+1).equals("a")){
                System.out.print(letra);
            }
            else{
                System.out.print(this.cadena.substring(i,i+1));
            }
        }
        System.out.println("");
    }
    
    public boolean contiene(String letra){
        for (int i = 0; i < longitud; i++) {
            if(this.cadena.substring(i,i+1).equals(letra)){
                return true;
            }
        }
        return false;
    }
}
