/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

public class StudentInsertMain {
    public static void main(String[] args) {
        // Create one Student object
        Student newStudent = new Student(2, "Bimal Perera", 92);
        
        // Create one StudentDAO object and call addStudent
        StudentDAO dao = new StudentDAO();
        dao.addStudent(newStudent);
    }
}
