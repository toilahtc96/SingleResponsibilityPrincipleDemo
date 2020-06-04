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
public class RegisterScholarship {

    public boolean applyForScholarship(Student study) {
        try {
            // Trying to apply for scholarship
            return true;
        } catch (Exception ex) {
            //write error to log file
            System.out.println("Error_log.txt");
            return false;
        }
    }
}
