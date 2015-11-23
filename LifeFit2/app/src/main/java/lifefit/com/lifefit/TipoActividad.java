package lifefit.com.lifefit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

/**
 * Created by manuel on 21/11/2015.
 */
public class TipoActividad {

    private int idTipo;
    private String descripcion;

    //constructor
    public TipoActividad(){
        idTipo = 0;
        descripcion = "";
    }

    //sets and gets
    public void setIdTipo(int idTipo){
        this.idTipo = idTipo;
    }
    public int getIdTipo(){
        return idTipo;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }

    @SuppressWarnings("unused")
    public static Connection CrearConexion(){
        try {

            Connection conexion;
            Class.forName("com.mysql.jdbc.Driver");
            return conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.24:3306/lifefit", "root", "12345");

        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }
    public static LinkedList<TipoActividad> getTiposActividad()
    {
        LinkedList<TipoActividad> listaTipos = new LinkedList<TipoActividad>();
        Connection conexion = CrearConexion();

        try
        {

            assert conexion != null;
            Statement st = null;
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select * from tipoactividades" );

            while (rs.next())
            {
                TipoActividad tipoActividad = new TipoActividad();
                tipoActividad.setIdTipo(rs.getInt("idtipo"));
                tipoActividad.setDescripcion(rs.getString("descripcion"));
                listaTipos.add(tipoActividad);
            }
            rs.close();
            st.close();
            conexion.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return listaTipos;
    }
}
