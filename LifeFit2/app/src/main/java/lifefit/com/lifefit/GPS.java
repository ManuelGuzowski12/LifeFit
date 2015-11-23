package lifefit.com.lifefit;

/**
 * Created by manuel on 21/11/2015.
 */
public class GPS {

    private int idGps;
    private double lat;
    private double log;
    private double tiempo;
    private double distancia;
    private double velocidad;
    private int idActividad;

    //constructor
    public GPS(){
        idGps = 0;
        lat = 0.00;
        log = 0.00;
        tiempo = 0.00;
        distancia = 0.00;
        velocidad = 0.00;
        idActividad = 0;
    }

    //set and gets
    public void setIdGps(int idGps){
        this.idGps = idGps;
    }
    public int getIdGps(){
        return idGps;
    }
    public void setLat(double lat){
        this.lat = lat;
    }
    public double getLat(){
        return lat;
    }
    public void setLog(double log){
        this.log = log;
    }
    public double getLog(){
        return log;
    }
    public void setTiempo(double tiempo){
        this.tiempo = tiempo;
    }
    public double getTiempo(){
        return tiempo;
    }
    public void setDistancia(double distancia){
        this.distancia = distancia;
    }
    public double getDistancia(){
        return distancia;
    }
    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }
    public double getVelocidad(){
        return velocidad;
    }
    public void setIdActividad(int idActividad){
        this.idActividad = idActividad;
    }
    public int getIdActividad(){
        return idActividad;
    }
}
