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
       Boolean res;
       CheckPermutation cp = new CheckPermutation();
       res = cp.check("apple", "dpple");
       System.out.println(res);
       res = cp.check("apple", "pplea");
       System.out.println(res);
    }
    
}
