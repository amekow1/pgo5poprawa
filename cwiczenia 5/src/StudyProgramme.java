public class StudyProgramme {
  private String name;
  private String description;
  private int numberOfSemesters;
  private int maxItNs;
  public StudyProgramme(String name, String description, int numberOfSemesters, int maxItNs) {
    this.name = name;
    this.description = description;
    this.numberOfSemesters = numberOfSemesters;
    this.maxItNs = maxItNs;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getNumberOfSemesters() {
    return numberOfSemesters;
  }

  public int getMaxItNs() {
    return maxItNs;
  }


}
