package studentmanagementsystem;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Aryan Mehta
 */
public class studentServices {

    private PreparedStatement ps;
    private db_conn db = new db_conn();
    private ResultSet rs;

    public int add_student(Student student) {
        return add_stud(student);
    }

    public Student find_student(long stud_id) {
        return find_stud(stud_id);
    }

    public int update_student(Student student) {
        return update_stud(student);
    }
    
    public ArrayList<Student> display_all_students(){
        return display_stud();
    }
    
    private Student find_stud(long stud_id) {
        Student student;

        try {
            ps = db.db_con.prepareStatement("SELECT * FROM studentdata WHERE stud_id = ?");
            ps.setLong(1, stud_id);

            rs = ps.executeQuery();

            if (rs.next()) {
                student = new Student(rs.getString("stud_name"),
                        rs.getLong("stud_id"),
                        rs.getString("stud_email"),
                        rs.getString("stud_mob_no"),
                        rs.getString("stud_div"));

                return student;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private int update_stud(Student student) {
        int status;
        try {
            ps = db.db_con.prepareStatement("UPDATE studentdata SET stud_id=?,stud_name=?,stud_email=?,stud_mob_no=?,stud_div=? WHERE stud_id = ?");
            ps.setLong(1, student.getStud_id());
            ps.setString(2, student.getStud_name());
            ps.setString(3, student.getStud_email());
            ps.setString(4, student.getStud_mob_no());
            ps.setString(5, student.getStud_div());
            ps.setLong(6, student.getStud_id());

            return status = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    private int add_stud(Student student) {
        int status = 0;
        try {
            ps = db.db_con.prepareStatement("INSERT INTO studentData VALUES(?,?,?,?,?)");
            ps.setLong(1, student.getStud_id());
            ps.setString(2, student.getStud_name());
            ps.setString(3, student.getStud_email());
            ps.setString(4, student.getStud_mob_no());
            ps.setString(5, student.getStud_div());

            return status = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    private ArrayList<Student> display_stud(){
        ArrayList<Student> stud_list = new ArrayList<>();
        
        try {
            ps = db.db_con.prepareStatement("SELECT * FROM studentdata");
            rs = ps.executeQuery();
            while(rs.next()){
                Student student = new Student(rs.getString("stud_name"),
                        rs.getLong("stud_id"),
                        rs.getString("stud_email"),
                        rs.getString("stud_mob_no"),
                        rs.getString("stud_div"));
                
                stud_list.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(stud_list.isEmpty()){
            return null;
        }else{
            return stud_list;
        }
    }
    
    public void closeCon(){
        try {
            db.db_con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
