package Test;

import Control.StudentManager;
import bean.Student;

import java.util.LinkedList;
import java.util.List;

public class SMTest {
    public static void main(String[] agrs){
        List<Student> StudentList = new LinkedList<Student>();
        StudentManager studentManager=new StudentManager();
        studentManager.App(StudentList);
    }

}
