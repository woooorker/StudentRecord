package student.dao.impl;

import student.dao.StudentDao;
import student.model.Student;
import student.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public boolean insertStudent(Object[] params) {
        String sql = "insert into student values(?,?,?,?,?)";
        return DBUtil.executeUpdate(sql,params);
    }

    @Override
    public boolean deleteStudent(int stuNo) {
        String sql="delete from student where stuNo=?";
        Object[] params = {stuNo};
        return DBUtil.executeUpdate(sql,params);

    }

    @Override
    public List<Student> queryAllStudent() {
        List<Student> students = new ArrayList<>();
        String sql = "select * from student";
        ResultSet rs = DBUtil.query(sql,null);
        while (true){
            try {
                if (!rs.next()) break;
                int stuNo = rs.getInt("stuno");
                String stuName = rs.getString("stuname");
                int stuAge = rs.getInt("stuage");
                String graName = rs.getString("graname");
                String stuSex = rs.getString("stusex");
                Student student = new Student(stuNo,stuName,stuAge,graName,stuSex);
                students.add(student);
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }

        }
        return students;

    }
}
