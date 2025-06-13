package model;
/*для Student — String fullName, String universityId, int currentCourseNumber,
float avgExamScore. */
public class Student {
    private String fullName;
    private String universityId;
    private int currentCourseNumber;
    private float avgExamScore;
    private static  int count=0;

    public Student() {
    }

    public Student(String fullName, String universityId, int currentCourseNumber, float avgExamScore) {
        this.avgExamScore = avgExamScore;
        this.currentCourseNumber = currentCourseNumber;
        this.fullName = fullName;
        this.universityId = universityId;
        count++;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public Student setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
        return this;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public Student setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public Student setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getUniversityId() {
        return universityId;
    }

    public Student setUniversityId(String universityId) {
        this.universityId = universityId;
        return this;
    }

    @Override
    public String toString() {
        return "{Student   " +
                currentCourseNumber + " "+
                fullName + " "+
                universityId + " " +
                avgExamScore +
                '}'+"\n" ;
    }

}
