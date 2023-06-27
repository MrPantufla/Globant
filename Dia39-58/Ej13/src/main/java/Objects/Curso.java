package Objects;

public class Curso {
    private String nombre;
    private int horasPorDia;
    private int diasPorSemana;
    private String turno;
    private int precioPorHora;
    private String[] alumnos;

    public Curso() {
    }
    
    public Curso(String nombre, int horasPorDia, int diasPorSemana, String turno, int precioPorHora) {
        this.nombre = nombre;
        this.horasPorDia = horasPorDia;
        this.diasPorSemana = diasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        alumnos= new String[5];
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasPorDia() {
        return horasPorDia;
    }

    public int getDiasPorSemana() {
        return diasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasPorDia(int horasPorDia) {
        this.horasPorDia = horasPorDia;
    }

    public void setDiasPorSemana(int diasPorSemana) {
        this.diasPorSemana = diasPorSemana;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
}
