import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
  private static int indexCounter = 1;

  public static final String CANDIDATE = "Candidate";
  public static final String STUDENT = "Student";
  public static final String GRADUATE = "Graduate";

  private String firstName;
  private String lastName;
  private String email;
  private String address;
  private Date birthDate;
  private String indexNumber;
  private StudyProgramme studyProgramme;
  private int currentSemester;
  private String status;
  ArrayList<Grade> grades= new ArrayList<Grade>();


  public Student(String firstName, String lastName, String email, String address, Date birthDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.address = address;
    this.birthDate = birthDate;
    this.indexNumber = "s"+ indexCounter++;
    this.studyProgramme = studyProgramme;
    this.currentSemester = currentSemester;
    this.status = status;
    this.grades = grades;
  }


  public void enrollStudent(StudyProgramme studyProgramme) {
    this.studyProgramme = studyProgramme;
    this.currentSemester = 1;
    setStatus(STUDENT);
  }

  public void addGrade(int grade) {
    grades.add(new Grade(grade));
  }

  public void promoteToNextSemester() {
    if (getStatus().equals(GRADUATE)) {
      return;
    }

    int itns = 0;
    for (Grade grade : grades) {
      if (grade.getGrade() < 3) {
        itns++;
      }
    }

    if (itns > studyProgramme.getMaxItNs()) {
      return;
    }

    if (currentSemester < studyProgramme.getNumberOfSemesters()) {
      currentSemester++;
      if (currentSemester == studyProgramme.getNumberOfSemesters()) {
        setStatus(GRADUATE);
      }
    }
  }

  public String getIndexNumber() {
    return indexNumber;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public StudyProgramme getStudyProgramme() {
    return studyProgramme;
  }

  public void setStudyProgramme(StudyProgramme studyProgramme) {
    this.studyProgramme = studyProgramme;
  }

  public int getCurrentSemester() {
    return currentSemester;
  }

  public void setCurrentSemester(int currentSemester) {
    this.currentSemester = currentSemester;
  }




  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void displayInfo() {
    System.out.println("Index Number: " + indexNumber);
    System.out.println("Name: " + firstName + " " + lastName);
    System.out.println("Email: " + email);
    System.out.println("Address: " + address);
    System.out.println("Birth Date: " + birthDate);
    System.out.println("Current Semester: " + currentSemester);
    System.out.println("Status: " + status);
    System.out.print("Grades: ");
    for (Grade grade : grades) {
      System.out.print(grade.getGrade() + " ");
    }
    System.out.println();
  }

}
