package lesson_2_6;

import java.util.HashSet;
import java.util.Set;

import static lesson_2_6.Student.*;

public class lesson_2_6 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        Student student1 = new Student("Сергей Иванов", "Б-10", 3);
        student1.addGrade("Математика", 3);
        student1.addGrade("Бурение", 3);
        student1.addGrade("Химия", 3);

        Student student2 = new Student("Николай Полевой", "Э-17", 3);
        student2.addGrade("Математика", 3);
        student2.addGrade("Эксплуатация", 4);
        student2.addGrade("Физика", 4);

        Student student3 = new Student("Вадим Птицин", "П-6", 4);
        student3.addGrade("Математика", 3);
        student3.addGrade("Информатика", 4);
        student3.addGrade("Компьютерные сети", 5);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println("Все студенты:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nУдаляем студентов с средним баллом < 3:");
        removeStudents(students);

        System.out.println("\nПосле удаления:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nПереводим студентов на следующий курс:");
        promoteStudents(students);

        System.out.println("\nПосле перевода:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();
        printStudents(students, 3);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addSubscriber("Иванов", "123-456");
        phoneBook.addSubscriber("Иванов", "789-012");
        phoneBook.addSubscriber("Полевой", "345-678");
        phoneBook.addSubscriber("Птицин", "901-234");
        phoneBook.addSubscriber("Иванов", "567-890");

        System.out.println("\nВесь телефонный справочник:");
        phoneBook.printAll();

        System.out.println("\nПоиск по фамилии:");
        System.out.println("Иванов: " + phoneBook.getSubscriber("Иванов"));
        System.out.println("Полевой: " + phoneBook.getSubscriber("Полевой"));
        System.out.println("Птицин: " + phoneBook.getSubscriber("Птицин"));
    }

}
