package data_methods;

import data_methods.Student;
import java.util.ArrayList;

/**
 *
 * @author Aryan Mehta
 */
//DAO methods for students
public interface StudentService {
    
    public int add_student(Student student);
    public Student find_student(String stud_id);
    public int update_student(Student student);
    public ArrayList<Student> display_all_students();
    public int remove_stud(String stud_id);
    public void closeCon();
}
