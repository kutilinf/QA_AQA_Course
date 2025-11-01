package lesson_2_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Student {
    private String nameStudent;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    public Student(String nameStudent, String group, int course) {
        this.nameStudent = nameStudent;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void nextCourse() {
        this.course = this.course + 1;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return nameStudent + " (группа: " + group + ", курс: " + course + ", средний балл: " + String.format("%.2f", getAverageGrade()) + ")";
    }

    public static void removeStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() > +3) {
                student.nextCourse();
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты " + course + " курса:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getNameStudent() + " -группа " + student.getGroup());
            }
        }
    }

}
