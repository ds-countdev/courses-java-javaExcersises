package poo_inheritance.mx.diego;

public class InternationalStudent extends Student{
    private String country;
    private double languagesScore;

    InternationalStudent(){System.out.println("initializing InternationalStudent constructor");}

    InternationalStudent(String name, String lastName, int age, String email, String institution, String country){
        super(name, lastName, age, email, institution);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLanguagesScore() {
        return languagesScore;
    }

    public void setLanguagesScore(double languagesScore) {
        this.languagesScore = languagesScore;
    }
}
