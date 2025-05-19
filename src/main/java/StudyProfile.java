public enum StudyProfile {
    MEDICINE("Медицина"),
    ENGINEERING("Инженерия"),
    ARTS("Искусство");

    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }

}
