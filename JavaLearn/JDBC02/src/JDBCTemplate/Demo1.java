package JDBCTemplate;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author solang
 * @date 2021-03-29 20:49
 */
public class Demo1 {
    DataSource ds = JDBCUtils.getDataSource();
    JdbcTemplate template = new JdbcTemplate(ds);
    @Test
    public void test1() {

        //2. 定义sql
        String sql = "update emp set salary = 10000 where id = 1001";
        //3. 执行sql
        int count = template.update(sql);
        System.out.println(count);
    }


    @Test
    public void test2() {
        String sql = "update account set balance=5000 where id =?";
        int count = template.update(sql, 3);
        System.out.println(count);
    }
    /**
     * 6. 查询所有记录，将其封装为Emp对象的List集合
     */

    @Test
    public void test6_2(){
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

}
