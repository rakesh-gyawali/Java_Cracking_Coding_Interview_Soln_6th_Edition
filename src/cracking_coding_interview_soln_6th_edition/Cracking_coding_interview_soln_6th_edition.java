/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking_coding_interview_soln_6th_edition;

/**
 *
 * @author rakes
 */
public class Cracking_coding_interview_soln_6th_edition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IsUnique iu = new IsUnique();
        Boolean res = iu.CheckString("aeiou");
        System.out.println(res);
        res = iu.CheckString("aeiuou");
        System.out.println(res); 
    }
    
}
