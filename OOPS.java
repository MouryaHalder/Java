class Pen {
    String color;
    String type;
    public void write(){
        System.out.println("Write something");

    }
    public void printcolour(){
        system.out.println(this.colour);
    }
}

public class OOPS {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
   pen pen2 = new pen();
   pen2.color = "black";
   pen2.type = "ballpoint";
   pen1.printcolor();
   pen2.printcolor();
    }
    }
