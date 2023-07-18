class  Pen{  //class ar under a blueprint define hoi
    String color;
    String type; //ballpoint or gel
    
    public void write(){ //functions under class  in called (methods)
        System.out.println("Writing something");
    }

    public void printColor(){  //method or function
        System.out.println(this.color);  //this identify kore kon boject  call koreche like pen 1 or 2
    }
}

public class oops1{
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue pen"; //.to use access the property
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black pen";
        pen2.type =  "ballpoint pen";
        
        pen1.write(); //function call  hocche
        pen1.printColor();
        pen2.printColor(); 
    }
}