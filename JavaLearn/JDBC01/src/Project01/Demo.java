package Project01;

import JDBC03LianXi.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author solang
 * @date 2021-03-28 18:05
 */
public class Demo {
    public static void main(String[] args) {

        List<Emp> list = findAll();
        System.out.println(list);
        System.out.println(list.size());
    }
    public static ArrayList<Emp> findAll(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Emp> list = null;
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "123456");
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "select * from emp";
            rs = stmt.executeQuery(sql);
            Emp emp=new Emp();
            list =new ArrayList<Emp>();
            while (rs.next()){
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                // 创建emp对象,并赋值
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                //装载集合
                list.add(emp);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,conn);
        }
        return list;
    }
}
