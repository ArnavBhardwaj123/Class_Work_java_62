public class School_Student extends student{

    School_Student(int roll_no  , String name){
        super(roll_no,name);
    }

    public void attend_class(){
        System.out.println(name+"is attending class offline in school");
    }
    public void give_exam(){
        System.out.println(name+"is giving exam on pen and paper in school");
    }
}
