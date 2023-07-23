public class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing  something");
    }
    public void printColor() {
        system.out.println(this.color)
    }
}

class Student {
    String name;
    int age;
    public void printName() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name =  "Mourya";
        s1.age = 19;

        s1.printInfo();
    }
}