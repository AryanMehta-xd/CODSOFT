package data_methods;

/**
 *
 * @author Aryan Mehta
 */
//entity
public class Student {
    private String stud_name;
    private String stud_id;
    private String stud_email;
    private String stud_mob_no;
    private String stud_div;

    public String getStud_name() {
        return stud_name;
    }

    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }

    public String getStud_id() {
        return stud_id;
    }

    public void setStud_id(String stud_id) {
        this.stud_id = stud_id;
    }

    public String getStud_email() {
        return stud_email;
    }

    public void setStud_email(String stud_email) {
        this.stud_email = stud_email;
    }

    public String getStud_mob_no() {
        return stud_mob_no;
    }

    public void setStud_mob_no(String stud_mob_no) {
        this.stud_mob_no = stud_mob_no;
    }

    public String getStud_div() {
        return stud_div;
    }

    public void setStud_div(String stud_div) {
        this.stud_div = stud_div;
    }

    public Student(String stud_name, String stud_id, String stud_email, String stud_mob_no, String stud_div) {
        this.stud_name = stud_name;
        this.stud_id = stud_id;
        this.stud_email = stud_email;
        this.stud_mob_no = stud_mob_no;
        this.stud_div = stud_div;
    }

    @Override
    public String toString() {
        return "Student{" + "stud_name=" + stud_name + ", stud_id=" + stud_id + ", stud_email=" + stud_email + ", stud_mob_no=" + stud_mob_no + ", stud_div=" + stud_div + '}';
    }
    
    
}
