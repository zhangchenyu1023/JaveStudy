package demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author zhangchenyu
 * @date 2021-03-26 16:22
 */
public class JDBC01 {
    public static void main(String[] args) throws Exception {
        //1. 导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db6", "zhang", "123");
        //4.定义sql语句
        String sql = "desc account";
        //5.获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();
    }
}
