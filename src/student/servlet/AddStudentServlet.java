package student.servlet;

import student.model.Student;
import student.service.StudentService;
import student.service.impl.StudentServiceImpl;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(name = "AddStudentServlet",urlPatterns = "/AddStudentServlet")
public class AddStudentServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        int stuNo = Integer.parseInt(request.getParameter("stuNo"));
        String stuName = request.getParameter("stuName");
        int stuAge = Integer.parseInt(request.getParameter("stuAge"));
        String graName = request.getParameter("graName");
        String stuSex = request.getParameter("stuSex");
        Student student = new Student(stuNo,stuName,stuAge,graName,stuSex);
        StudentService ss = new StudentServiceImpl();
        boolean result = ss.addStudent(student);

        request.getRequestDispatcher("DisplayStudentServlet").forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
