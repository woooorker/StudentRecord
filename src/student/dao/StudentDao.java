package student.dao;

import student.model.Student;

import java.util.List;

public interface StudentDao {
    //插入学生
    public boolean insertStudent(Object[] params);
    //删除学生
    public boolean deleteStudent(int stuNo);
    //查找所有学生
    public List<Student> queryAllStudent();
}
