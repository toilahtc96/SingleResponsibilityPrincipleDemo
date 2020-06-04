/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;


/**
 *
 * @author os_conght
 */
public class SmellStudent {

    private String name;
    private int age;
    private String student_type;

    public String getStudentInfoHtml() {
        return "<span> Name: " + name + ", age: " + age + "</span>";
    }

    public boolean applyForScholarship() {
        try {
            // Trying to apply for scholarship
            return true;
        } catch (Exception ex) {
            //write error to log file
            System.out.println("Error_log.txt");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudent_type() {
        return student_type;
    }

    public void setStudent_type(String student_type) {
        this.student_type = student_type;
    }

   

}
