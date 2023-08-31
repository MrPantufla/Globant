package Objects;

import java.util.ArrayList;

public class Voto {
    private Alumno alumno;
    private ArrayList votados;

    public Voto() {
    }

    public Voto(Alumno alumno, ArrayList votados) {
        this.alumno = alumno;
        this.votados = votados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList getVotados() {
        return votados;
    }

    public void setVotados(ArrayList votados) {
        this.votados = votados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", votados=" + votados + '}';
    }
    
    
}
