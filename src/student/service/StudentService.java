package student.service;

import student.dao.StudentDao;
import student.dao.impl.StudentDaoImpl;
import student.model.Student;

import java.util.List;

public interface StudentService {
    //增加一个学生
    public boolean addStudent(Student student);
    //删除一个学生
    public boolean deleteStudent(int stuNo);
    //查找所有学生
    public List<Student> queryAllStudent();
}
