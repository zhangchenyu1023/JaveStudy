package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author solang
 * @date 2021-03-29 20:23
 */
public class DruidDemo {
    public static void main(String[] args) {
        Connection conn =null;
        PreparedStatement pstmt=null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into account values(?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,4);
            pstmt.setString(2,"limei");
            pstmt.setInt(3,500);
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }
    }
}
