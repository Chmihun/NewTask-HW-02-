package model;
/*Добавить в модельные классы набор полей на своё усмотрение, но обязательными являются:
для University — String id, String fullName, String shortName,
int yearOfFoundation, StudyProfile mainProfile;*/
public class University {
    private String id;
    private String fullName;
    private String shortName;
    private int yearOfFoundation;
    private StudyProfile mainProfile;

    public University() {
    }

    public String getFullName() {
        return fullName;
    }

    public University setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getId() {
        return id;
    }

    public University setId(String id) {
        this.id = id;
        return this;
    }

    public StudyProfile getMainProfile(StudyProfile medicine) {
        return mainProfile;
    }

    public University setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
//        this.mainProfile = StudyProfile.valueOf(mainProfile.getProfileName());
        return this;
//        System.out.println(StudyProfile.ENGINEERING.getProfileName());
    }

    public String getShortName() {
        return shortName;
    }

    public University setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public University setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
        return this;
    }

    @Override
    public String toString() {
        return "University{" +
                "fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                ", shortName='" + shortName + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", mainProfile=" + mainProfile.getProfileName() +
                '}';
    }
}
