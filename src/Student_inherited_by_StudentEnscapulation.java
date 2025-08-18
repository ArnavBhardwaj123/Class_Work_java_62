public class Student_inherited_by_StudentEnscapulation extends Student_Ensacpulation{
    public int roll_no;

    public Student_inherited_by_StudentEnscapulation(String address, int roll_no) {
        super(address);
        this.roll_no = roll_no;
    }
    public void show_rollno(){
        System.out.println("The roll no. is"+ roll_no);
    }
}
