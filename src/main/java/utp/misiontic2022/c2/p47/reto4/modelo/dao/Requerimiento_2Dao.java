package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código
        ArrayList<Requerimiento_2> arreglo = new ArrayList<Requerimiento_2>();
        //coneccion
        Connection conn = JDBCUtilities.getConnection();
        // consulta con el try 
        try {
            String sql = "SELECT p.Fecha_Inicio, p.Ciudad, p.Constructora, " +
            "l.Nombre || ' ' || l.Segundo_Apellido AS 'Nombre Lider', " +
            "t.Codigo_Tipo, t.Estrato " +
            "FROM Proyecto p  INNER JOIN Lider l ON p.ID_Lider = l.ID_Lider " + 
            "INNER JOIN Tipo t ON p.ID_Tipo = t.ID_Tipo " +
            "WHERE (p.Fecha_Inicio >= '2019-09-01' AND p.Fecha_Inicio <= '2019-09-09' AND p.Ciudad = 'Pereira')";

            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            // recorrer lo que trae la consulta
            while (rs.next()) {
                Requerimiento_2 requerimiento_2 = new Requerimiento_2(
                    rs.getString("Fecha_Inicio"),
                    rs.getString("Ciudad"),
                    rs.getString("Constructora"),
                    rs.getString("Nombre Lider"),
                    rs.getInt("Codigo_tipo"),
                    rs.getInt("Estrato") );

                    arreglo.add(requerimiento_2);
                
            }
            //rs.close();
            //stm.close();

        } catch (SQLException e) {
            System.out.println("problemas coneccion requerimiento 2"+e);

        }finally{
            if (conn != null) {
                conn.close();
            }
        }
        return arreglo;

    }
}