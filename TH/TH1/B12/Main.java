package TH1.B12;

import java.io.IOException;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc.close();

        ArrayList<Subject> subjects = new ArrayList<>();
        sc = new Scanner(new File("DETAI.in"));
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            subjects.add(new Subject(sc.nextLine(), sc.nextLine()));
        }
        sc.close();

        ArrayList<Assignment> assignments = new ArrayList<>();
        sc = new Scanner(new File("NHIEMVU.in"));
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String msv = sc.next();
            String subjectID = sc.next();
            Assignment assignment = new Assignment(msv, subjectID);

            for (Student student : students) {
                if (student.getId().equals(msv)) {
                    assignment.setStd(student) ;
                }
            }
            for (Subject subject : subjects) {
                if (subject.getId().equals(subjectID)) {
                    assignment.setSbj(subject);
                }
            }

            assignments.add(assignment);
        }
        sc.close();

        Collections.sort(assignments);
        for (Assignment assignment : assignments) {
            System.out.println(assignment);
        }
    }
}
    
    

