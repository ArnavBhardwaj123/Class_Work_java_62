package unit1;

public class college_Student extends student {
    college_Student(int roll_no  , String name){
        super(roll_no,name);
    }

    public void attend_class(){
        System.out.println(name+" is attending class offline in college");
    }
    public void give_exam(){
        System.out.println(name+" is giving exam on pen and paper in college");
    }
}
