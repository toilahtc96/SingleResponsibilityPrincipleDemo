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
public class GenerateHtml {

    public String getStudentInfoHtml(Student study) {
        return "<span> Name: " + study.getName() + ", age: " + study.getName() + "</span>";
    }
}
