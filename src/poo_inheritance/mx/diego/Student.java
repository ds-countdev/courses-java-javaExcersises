package poo_inheritance.mx.diego;

class Student extends Person{
    private Long idStudent;
    private static Long lastIdStudent;
    private String institution;
    private float historyScore;
    private float mathScore;

    public Student(){
        System.out.println("initializing Student constructor");
        this.idStudent = ++lastIdStudent;
    }

    public Student(String name, String lastName, int age, String email, String institution){
        super(name,lastName,age,email);
        this.institution = institution;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public String getInstitution() {
        return institution;
    }

    public float getHistoryScore() {
        return historyScore;
    }

    public void setHistoryScore(float historyScore) {
        this.historyScore = historyScore;
    }

    public float getMathScore() {
        return mathScore;
    }

    public void setMathScore(float mathScore) {
        this.mathScore = mathScore;
    }

    String wave(){
        return super.wave().concat(" im a student, my name is ").concat(name);
    }

    double average(){ return (historyScore + mathScore) / 2;}

    @Override
    public String toString() {
        return super.toString() +
                "idStudent=" + idStudent +
                ", institution='" + institution + '\'' +
                ", historyScore=" + historyScore +
                ", mathScore=" + mathScore +
                ", average= " + this.average();
    }
}
