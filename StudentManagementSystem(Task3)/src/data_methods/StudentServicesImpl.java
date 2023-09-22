package data_methods;

import data_methods.Student;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Aryan Mehta
 */
public class StudentServicesImpl implements StudentService{

    private PreparedStatement ps;
    private db_conn db = new db_conn();
    private ResultSet rs;

    @Override
    public int add_student(Student student) {
        return add_stud(student);
    }
    
    @Override
    public Student find_student(String stud_id) {
        return find_stud(stud_id);
    }

    @Override
    public int update_student(Student student) {
        return update_stud(student);
    }

    @Override
    public ArrayList<Student> display_all_students() {
        return display_stud();
    }

    @Override
    public int remove_stud(String stud_id) {
        return remove_st(stud_id);
    }

    private Student find_stud(String stud_id) {
        Student student;

        try {
            ps = db.db_con.prepareStatement("SELECT * FROM studentdata WHERE stud_id = ?");
            ps.setString(1, stud_id);

            rs = ps.executeQuery();

            if (rs.next()) {
                student = new Student(rs.getString("stud_name"),
                        rs.getString("stud_id"),
                        rs.getString("stud_email"),
                        rs.getString("stud_mob_no"),
                        rs.getString("stud_div"));

                return student;
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    private int update_stud(Student student) {
        int status;
        try {
            ps = db.db_con.prepareStatement("UPDATE studentdata SET stud_id=?,stud_name=?,stud_email=?,stud_mob_no=?,stud_div=? WHERE stud_id = ?");
            ps.setString(1, student.getStud_id());
            ps.setString(2, student.getStud_name());
            ps.setString(3, student.getStud_email());
            ps.setString(4, student.getStud_mob_no());
            ps.setString(5, student.getStud_div());
            ps.setString(6, student.getStud_id());

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
            ps.setString(1, student.getStud_id());
            ps.setString(2, student.getStud_name());
            ps.setString(3, student.getStud_email());
            ps.setString(4, student.getStud_mob_no());
            ps.setString(5, student.getStud_div());

            return status = ps.executeUpdate();
        } catch (Exception e) {
            return 0;
        }
    }

    private ArrayList<Student> display_stud() {
        ArrayList<Student> stud_list = new ArrayList<>();

        try {
            ps = db.db_con.prepareStatement("SELECT * FROM studentdata");
            rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student(rs.getString("stud_name"),
                        rs.getString("stud_id"),
                        rs.getString("stud_email"),
                        rs.getString("stud_mob_no"),
                        rs.getString("stud_div"));

                stud_list.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (stud_list.isEmpty()) {
            return null;
        } else {
            return stud_list;
        }
    }

    private int remove_st(String stud_id) {
        int status = 0;
        try {
            ps = db.db_con.prepareStatement("DELETE FROM studentdata WHERE stud_id = ?");
            ps.setString(1, stud_id);

            return status = ps.executeUpdate();
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public void closeCon() {
        try {
            db.db_con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
