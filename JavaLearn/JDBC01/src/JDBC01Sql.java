import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 1. DriverManager类：
                 public static Connection getConnection(String url,String user,String password) throws SQLException
                 试图建立到给定数据库 URL 的连接
                 参数：
                 url - jdbc:mysql://IP地址:端口号/数据库名称
                 user - 用户名
                 password - 密码
                 返回数据库的连接对象
                 抛出SQLException - 如果发生数据库访问错误

2. Connection 接口
                 Statement createStatement() throws SQLException
                 创建一个 Statement 对象来将 SQL 语句发送到数据库
                 不带参数的 SQL 语句通常使用 Statement 对象执行。如果多次执行相同的 SQL 语句，使用 PreparedStatement 对象可能更有效。
                 返回一个新的默认 Statement 对象
                 抛出SQLException - 如果发生数据库访问错误，或者在关闭的连接上调用此方法
3. Statement 接口
                 1. boolean execute(String sql) ：可以执行任意的sql 了解
                 2. int executeUpdate(String sql) ：执行DML（insert、update、delete）语句、DDL(create，alter、drop)语句
                 * 返回值：影响的行数，可以通过这个影响的行数判断DML语句是否执行成功 返回值>0的则执行成功，反之，则失败。
                 3. ResultSet executeQuery(String sql)  ：执行DQL（select)语句
 */
public class JDBC01Sql {
    public static void main(String[] args) throws Exception {
        //1. 导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "123456");
//        Connection conn = DriverManager.getConnection("jdbc:mysql:///db1", "root", "123456");
        //4.定义sql语句
//        String sql = "INSERT INTO std1 VALUES(3,\"zhangsan\",20);";
//        String sql = "update std1 set name=\"zhang\" where id=1";
//        String sql = "delete from std1 where id=3";
        String sql = "select * from std1";
        //5.获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        if(count > 0){
            System.out.println("添加成功！");
        }else{
            System.out.println("添加失败！");
        }
        //8.释放资源
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}
}
