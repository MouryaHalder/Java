//WAJP to give example of default constructor
public class Constructor_1
{
    int a; //data member
    Constructor_1() //default constructor
    {
        a=76;
    }
    void display() //member method
    {
        System.out.println(a); //default value of a is 0
    }
    public static void main(String[] args) {
        Constructor_1 c1 = new Constructor_1(); //c1 is the object of constructor_1 class
        c1.display();
    }
}