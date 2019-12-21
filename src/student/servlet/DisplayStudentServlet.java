package student.servlet;

import student.model.Student;
import student.service.StudentService;
import student.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "DisplayStudentServlet", urlPatterns = "/DisplayStudentServlet")
public class DisplayStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentService ss = new StudentServiceImpl();
        ArrayList<Student> students = (ArrayList<Student>) ss.queryAllStudent();
        request.setCharacterEncoding("utf-8");
        request.setAttribute("students",students);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
