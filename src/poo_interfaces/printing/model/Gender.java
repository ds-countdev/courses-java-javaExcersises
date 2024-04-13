package poo_interfaces.printing.model;

public enum Gender {

    DRAMA("Drama"),
    ACTION("Action"),
    ADVENTURE("Adventure"),
    TERROR("Terror"),
    PROGRAMMING("Programming"),
    SCIENCE_FICTION("Science_fiction");

    private final String genderName;

    Gender(String genderName){this.genderName = genderName;}

    @Override
    public String toString() {
        return this.genderName;
    }
}
