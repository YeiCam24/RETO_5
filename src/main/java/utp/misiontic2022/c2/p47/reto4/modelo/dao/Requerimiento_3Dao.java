package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {


    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {

        ArrayList<Requerimiento_3> arreglo = new ArrayList<Requerimiento_3>();
        // la coneccion
        Connection conn = JDBCUtilities.getConnection();
        // la consulta entr el try
        try {
            String sql ="SELECT SUBSTR(l.Nombre,1,3) || SUBSTR(l.Primer_Apellido,1,3) "
            + "|| SUBSTR(l.Segundo_Apellido,1,3) AS 'Abrev' "
            + "FROM Lider l";

            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            /// recorrer la consulta 
            while (rs.next()) {
                Requerimiento_3 requerimiento_3 = new Requerimiento_3(
                    rs.getString("Abrev")
                );
                arreglo.add(requerimiento_3);
            }
            rs.close();
            stm.close();
         

        } catch (SQLException e) {
            System.out.println("error en coneccion consulta 3  "+ e);
        }finally{
            if (conn != null) {
                conn.close();
                
            }
        }
        return arreglo;

    }
}