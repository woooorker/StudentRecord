package student.service.impl;

import student.dao.StudentDao;
import student.dao.impl.StudentDaoImpl;
import student.model.Student;
import student.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public boolean addStudent(Student student) {
        Object[] params = {student.getStuNo(), student.getStuName(), student.getStuAge(), student.getGraName(), student.getStuSex()};
        StudentDao sd = new StudentDaoImpl();
        return sd.insertStudent(params);
    }

    @Override
    public boolean deleteStudent(int stuNo) {
        StudentDao sd = new StudentDaoImpl();
        return sd.deleteStudent(stuNo);
    }

    @Override
    public List<Student> queryAllStudent() {
        StudentDao sd = new StudentDaoImpl();
        return sd.queryAllStudent();
    }
}
