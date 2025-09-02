import com.example.model.Student;
import com.example.model.Teacher;
import com.example.service.SchoolService;

public class Main {
    public static void main(String[] args) {
        SchoolService schoolService = new SchoolService();

        Student student1 = new Student("葵",15,"A",3);
        Student student2 = new Student("千尋",14,"D",2);
        Student student3 = new Student("司",13,"C",1);
        Student student4 = new Student("蓮",15,"A",3);
        Student student5 = new Student("香奈",14,"B",2);

        schoolService.addStudent(student1);
        schoolService.addStudent(student2);
        schoolService.addStudent(student3);
        schoolService.addStudent(student4);
        schoolService.addStudent(student5);

        Teacher teacher1 = new Teacher("椎名",28,"現代社会");
        Teacher teacher2 = new Teacher("永井",31,"数学");
        Teacher teacher3 = new Teacher("松永",45,"理科");
        Teacher teacher4 = new Teacher("琴吹",35,"英語");
        schoolService.addTeacher(teacher1);
        schoolService.addTeacher(teacher2);
        schoolService.addTeacher(teacher3);
        schoolService.addTeacher(teacher4);

        schoolService.printAllStudents();
        schoolService.printAllTeachers();
    }
}
