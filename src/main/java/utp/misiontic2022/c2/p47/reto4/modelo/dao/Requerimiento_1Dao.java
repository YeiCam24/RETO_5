package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {

        ArrayList<Requerimiento_1> arreglo = new ArrayList<Requerimiento_1>();
        // coneccion
        Connection conn = JDBCUtilities.getConnection();

        //consulta dentro del try
        try {
            String sql = "SELECT c.Fecha, c.ID_Compra, c.Proveedor, c.Pagado FROM Compra c ORDER BY c.ID_Compra DESC LIMIT 10";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            //recorrer los registros de la consulta 
            while (rs.next()) {
                Requerimiento_1 requerimiento_1 = new Requerimiento_1();
                requerimiento_1.setFechaCompra(rs.getString("fecha"));
                requerimiento_1.setCodCompra(rs.getInt("ID_Compra"));
                requerimiento_1.setNombreProveedor(rs.getString("Proveedor"));
                requerimiento_1.setPagado(rs.getString("Pagado"));

                arreglo.add(requerimiento_1);
            }

        } catch (SQLException e) {
            System.out.println("error en la consulta 1" + e);

        }finally{
            if (conn != null) {
                conn.close();
            }
        }
        return arreglo;


    }
}
