package Objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Simulador {
    ArrayList <String> nombres = new ArrayList();
    ArrayList <String> apellidos = new ArrayList();
    ArrayList <Integer> dnis = new ArrayList();
    ArrayList <Alumno> alumnos = new ArrayList();
    ArrayList <Voto> votos = new ArrayList();
    
    public void llenarListas(){
        nombres.add("Marina");
        nombres.add("Yesika");
        nombres.add("Juan");
        nombres.add("Joao");
        nombres.add("Manon");
        nombres.add("David");
        nombres.add("Angela");
        nombres.add("Alan");
        nombres.add("Lena");
        nombres.add("Mario");
        nombres.add("Sebastian");
        nombres.add("Valentina");
        nombres.add("Ana");
        nombres.add("Franco");
        nombres.add("Melina");
        apellidos.add("Calvani");
        apellidos.add("Simijaca");
        apellidos.add("Pizzio");
        apellidos.add("Rojas");
        apellidos.add("Goñi");
        apellidos.add("Cortes");
        apellidos.add("Montenegro");
        apellidos.add("Silva");
        apellidos.add("Diaz");
        apellidos.add("Carvajal");
        apellidos.add("Gutierrez");
        apellidos.add("Gomez");
        apellidos.add("Duarte");
        apellidos.add("Paramio");
        apellidos.add("Roldan");
    }
    
    public ArrayList generarDni(){
        Random random = new Random();
        
        int min = 41000000;
        int max = 42000000;
        
        for (int i = 0; i < nombres.size(); i++) {
            int numeroAleatorio = random.nextInt(max - min + 1) + min;
            dnis.add(numeroAleatorio);
        }
        
        return dnis;
    }
    
    public void generarAlumnos(){
        Random random = new Random();
        ArrayList <Integer> numeros = new ArrayList();
        
        int min=0;
        int max=14;
        
        for (int i = 0; i < nombres.size(); i++) {
            Alumno alumno = new Alumno();
            int numeroAleatorio = random.nextInt(max - min + 1) + min;
            alumno.setNombre(nombres.get(numeroAleatorio));
            
            boolean band=false;
            
            while(band==false){
                int numeroAleatorio2 = random.nextInt(max - min + 1) + min;
                
                if(!numeros.contains(numeroAleatorio2)){
                    numeros.add(numeroAleatorio2);
                    alumno.setNombre(alumno.getNombre() + " " + apellidos.get(numeroAleatorio2));
                    alumno.setDni(dnis.get(numeroAleatorio2));
                    band=true;
                }
            }
            
            alumnos.add(alumno);
        }
    }
    
    public void imprimirAlumnos(){
        for(Alumno i : alumnos){
            System.out.println(i.toString());
        }
    }
    
    public void votacion(){
        for(Alumno i : alumnos){
            Voto v = new Voto();
            ArrayList <Alumno> alumnosMezclada= new ArrayList<>(alumnos);
            ArrayList <Alumno> alumnosVotados = new ArrayList();
            Collections.shuffle(alumnosMezclada);
            v.setAlumno(i);
            for (int j = 0; j < 4; j++) {
                if(!(i.getNombre().equals(alumnosMezclada.get(j).getNombre()))){
                    alumnosVotados.add(alumnosMezclada.get(j));
                }
            }
            
            if(alumnosVotados.size()==4){
                alumnosVotados.remove(3);
            }
            
            v.setVotados(alumnosVotados);
            
            votos.add(v);
        }
        
        for(Voto k : votos){
            for (int i = 0; i < 3; i++) {
                for(Alumno a : alumnos){
                    if(k.getVotados().get(i)==(a)){
                        a.setCantVotos(a.getCantVotos()+1);
                        break;
                    }
                }
            }
        }
    }
    
    public void facilitadores(){
        Collections.sort(alumnos, Comparator.comparingInt(Alumno::getCantVotos).reversed());
        System.out.println("Los facilitadores serán:");
        System.out.println(alumnos.get(0).getNombre() + " con una cantidad de votos de: " + alumnos.get(0).getCantVotos());
        System.out.println(alumnos.get(1).getNombre() + " con una cantidad de votos de: " + alumnos.get(1).getCantVotos());
        System.out.println(alumnos.get(2).getNombre() + " con una cantidad de votos de: " + alumnos.get(2).getCantVotos());
        System.out.println(alumnos.get(3).getNombre() + " con una cantidad de votos de: " + alumnos.get(3).getCantVotos());
        System.out.println(alumnos.get(4).getNombre() + " con una cantidad de votos de: " + alumnos.get(4).getCantVotos());
        System.out.println("");
        System.out.println("Y los facilitadores suplentes:");
        System.out.println(alumnos.get(5).getNombre() + " con una cantidad de votos de: " + alumnos.get(5).getCantVotos());
        System.out.println(alumnos.get(6).getNombre() + " con una cantidad de votos de: " + alumnos.get(6).getCantVotos());
        System.out.println(alumnos.get(7).getNombre() + " con una cantidad de votos de: " + alumnos.get(7).getCantVotos());
        System.out.println(alumnos.get(8).getNombre() + " con una cantidad de votos de: " + alumnos.get(8).getCantVotos());
        System.out.println(alumnos.get(9).getNombre() + " con una cantidad de votos de: " + alumnos.get(9).getCantVotos());
    }
}
