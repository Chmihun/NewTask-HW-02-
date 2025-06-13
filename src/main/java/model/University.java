package model;

import java.util.Objects;

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

    public University(
            String fullName,
            String id,
            StudyProfile mainProfile,
            String shortName,
            int yearOfFoundation) {
        this.fullName = fullName;
        this.id = id;
        this.mainProfile = mainProfile;
        this.shortName = shortName;
        this.yearOfFoundation = yearOfFoundation;
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
        return "University{ " +
                id + " " + '\'' +
                fullName+ " " + '\'' +
                shortName + " " + '\'' +
                yearOfFoundation + " " +
                mainProfile.getProfileName() +
                " }" + "\n";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        University that = (University) object;
        return yearOfFoundation == that.yearOfFoundation && Objects.equals(id, that.id) && Objects.equals(fullName, that.fullName) && Objects.equals(shortName, that.shortName) && mainProfile == that.mainProfile;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, shortName, yearOfFoundation, mainProfile);
    }
}
