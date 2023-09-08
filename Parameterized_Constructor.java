//WAJP to give an example of parameterized constructor
class Parameterized_Constructor
{
    int x,y; //data member
    Parameterized_Constructor(int p,int q) //two Parameterized Constructor
    {
        x=p;
        y=q;
    }
    void display() //user defined member method
    {
        System.out.println(x+ " "+y);
    }
    public static void main(String[] args) {
        Parameterized_Constructor obj1= new Parameterized_Constructor(10,20); //obj1 is the object of Parameterized_Constructor
        obj1.display(); //calling the display() method
    }
}