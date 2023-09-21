package studentmanagementsystem;

/**
 *
 * @author Aryan Mehta
 */
public class StudentManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        studentServices ss = new studentServices();
        
        
        for(Student s : ss.display_all_students()){
            System.out.println(s);
        }
        
        System.out.println(ss.find_student(101));
        
        ss.closeCon();
    }
    
}
