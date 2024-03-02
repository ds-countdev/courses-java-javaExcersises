package poo_inheritance.mx.diego;

class Student extends Person{
    private Long idStudent;
    private static Long lastIdStudent;
    private String institution;
    private float historyScore;
    private float MathScore;

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
        return MathScore;
    }

    public void setMathScore(float mathScore) {
        MathScore = mathScore;
    }
}
