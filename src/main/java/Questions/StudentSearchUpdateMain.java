/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

public class StudentSearchUpdateMain {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        
        System.out.println("--- Finding Student 1 ---");
        dao.findStudentById(1);
        
        System.out.println("\n--- Updating Student 1's mark to 95 ---");
        dao.updateStudentMark(1, 95);
        
        System.out.println("\n--- Finding Student 1 Again ---");
        dao.findStudentById(1);
    }
}
