package datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author solang
 * @date 2021-03-29 20:01
 */
public class C3P0Demo1 {
    public static void main(String[] args) throws SQLException {
        //1.创建数据库连接池对象
        DataSource ds  = new ComboPooledDataSource();
        //2. 获取连接对象
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
