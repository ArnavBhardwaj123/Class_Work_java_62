package unit1;

public interface printable {
    void print();

    void show();
    private void display(){
        System.out.println("I am an interface private method");
    }
    static void say(){
        System.out.println("I am in say Method");
    }
}
