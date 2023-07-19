package Services;
import Objects.TemperatureConverter;

public class TemperatureConverterService {
    TemperatureConverter t = new TemperatureConverter();
    
    public void cargarDatos(double grados, String unidad){
        t.setGrados(grados);
        t.setUnidad(unidad);
    }
    
    public double convertirAC(){
        if(t.getUnidad().equals("f")){
            return (double)Math.round(((t.getGrados()-32)*5/9)*100)/100;
        }
        else if(t.getUnidad().equals("k")){
            return (double) Math.round((t.getGrados()-273.15)*100)/100;
        }
        else{
            return (t.getGrados());
        }
    }
    
    public double convertirAF(){
        if(t.getUnidad().equals("f")){
            return (t.getGrados());
        }
        else if(t.getUnidad().equals("c")){
            return (double) Math.round(((t.getGrados()*1.8)+32)*100)/100;
        }
        else{
            return (double) Math.round((1.8*(t.getGrados()-273.15)+32)*100)/100;
        }
    }
    
    public double convertirAK(){
        if(t.getUnidad().equals("k")){
            return (t.getGrados());
        }
        else if(t.getUnidad().equals("f")){
            return (double)Math.round(((((t.getGrados()-32)*5)/9)+273.15)*100)/100;
        }
        else{
            return (double) Math.round((t.getGrados()+273.15)*100)/100;
        }
    }
}
