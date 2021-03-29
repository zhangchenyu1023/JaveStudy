package JDBCTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;

/**
 * @author solang
 * @date 2021-03-29 20:49
 */
public class Demo1 {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "update account set balance=5000 where id =?" ;
        int count = template.update(sql,3);
        System.out.println(count);
    }
}
