package lifefit.com.lifefit;

import java.util.Date;

/**
 * Created by manuel on 21/11/2015.
 */
public class Sesion {

    private int idActividad;
    private int idTipo;
    private Date fecha;

    //constructor
    public Sesion(){
        idActividad = 0;
        idTipo = 0;
        fecha = null;
    }
    //sets and gets
    public void setIdActividad(int idActividad){
        this.idActividad = idActividad;
    }
    public int getIdActividad(){
        return idActividad;
    }
    public void setIdTipo(int idTipo){
        this.idTipo = idTipo;
    }
    public int getIdTipo(){
        return idTipo;
    }
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    public Date getFecha(){
        return fecha;
    }


}
