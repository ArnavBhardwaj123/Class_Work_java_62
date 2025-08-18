public   class Student_Ensacpulation {
//    public int roll_no;
//    public String name;
//
//
//
//    public void setGrade(String grade) {
//        this.grade = grade;
//    }
//    public String getGrade() {
//        return grade;
//    }
//
//    private String grade;
//
//    public Student_Ensacpulation(int roll_no, String name, String grade) {
//        this.roll_no = roll_no;
//        this.name = name;
//        this.grade = grade;
//    }

    protected String address;

    public Student_Ensacpulation(String address) {
        this.address = address;
    }
    public void show_address(){
        System.out.println("Adderess is "+address);
    }
}
