package com.pazz.java.database.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @describe 连接测试
 */
public class JdbcTest {

    public static void main(String[] args) throws Exception {
        Connection connection = Jdbc_Helper.getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from person");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println("p_id" + rs.getInt(1) + " pname" + rs.getString(2) + " page" + rs.getInt(3));
        }
        Jdbc_Helper.myClose(connection, ps, rs);

    }

}
