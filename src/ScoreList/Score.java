package ScoreList;

public class Score implements Comparable<Score> {
    String studentID;
    String studentName;
    String courseName;
    double score;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double string) {
        this.score = string;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public int compareTo(Score o) {
        return o.score > this.score ? 1 : -1;
    }
}
