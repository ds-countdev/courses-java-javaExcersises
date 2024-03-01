package mx.diego.proyect.home;

public class Person {

    private String name;
    private String email;

    private HairColor hairColor;

    public static final String MALE_GENDER = "Male";
    public static final String FEMALE_GENDER = "Female";

    public String getName(){ return this.name;}
    public String getEmail(){ return this.email;}
    public HairColor getHairColor() {return this.hairColor;}

    public void setName(String name){ this.name = name;}
    public void setEmail(String email){ this.email = email;}
    public void setHairColor(HairColor hairColor) {this.hairColor = hairColor;}

    public String throwBall(){
        return this.name.concat(" throws the ball to ");
    }

    public static String waving(){
        return "hello there";
    }

    @Override
    public String toString(){
        return this.name.concat(" says hello, and his hair is ".concat(this.hairColor.getColor()));
    }



}
