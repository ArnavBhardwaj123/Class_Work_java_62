public class emplloyee {
    int emp_id;
    String emp_name;
    double emp_salary;

    static String emp_org="TCS";
    public emplloyee(int emp_id, String emp_name, double emp_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
    }

    static void emp_info(){
        System.out.println("Emp org"+emp_org);

    }
    public void display(){
        emp_org="Infosys";
        System.out.println("Emp ID:"+emp_id);
        System.out.println("Emp Name"+emp_name);
        System.out.println("Emp salary"+emp_salary);
        System.out.println("Emp ORG"+emp_org);
    }
}
