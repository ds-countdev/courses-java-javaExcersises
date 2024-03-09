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

    @Override
    String wave(){
        return super.wave().concat(" am a foreign from ").concat(country);
    }

    @Override
    double average(){return ((super.average() * 2) + languagesScore) / 3;}

    @Override
    public String toString() {
        return super.toString() +
                "country='" + country + '\'' +
                ", languagesScore=" + languagesScore;
    }
}
