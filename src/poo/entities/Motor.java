package poo.entities;

public class Motor {

    private double cylinder;
    private MotorType motorType;

    public Motor(){}
    public Motor(double cylinder, MotorType motorType){
        this.cylinder = cylinder;
        this.motorType = motorType;
    }

    public double getCylinder(){return this.cylinder;}
    public MotorType MotorType(){return this.motorType;}

    public void setCylinder(double cylinder){ this.cylinder = cylinder;}
    public void setMotorType(MotorType motorType){this.motorType = motorType;}


}
