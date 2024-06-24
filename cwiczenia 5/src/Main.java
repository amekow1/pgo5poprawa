import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Student s = new Student("John", "Doe", "doewp@PL", "Warsaw, Zlota 44", new Date(1980, 1, 12));
    StudyProgramme it = new StudyProgramme("IT", "AAA", 7, 5);
    s.enrollStudent(it);
    s.addGrade(5);
    s.addGrade(2);

    s.displayInfo();

    s.promoteToNextSemester();
    s.displayInfo();
  }
}


