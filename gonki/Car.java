public class Car {
    int position;
    int n2o;
    int speed;
    String name;
    boolean status= false;
    boolean pok ;
    boolean repst = false;




    public void move() {
        position += speed;
        if((Math.random()*100)>60){
            position += speed + n2o;
        }

        else {
            position += speed;

        }

    }
    public Car(int index) {
        n2o = 20;
        speed = 10;
        position = 0;

        if (index == 1){
            n2o = 15;
            speed = 12;
            name = "Ferrary";}
        else
        if (index == 2){
            n2o = 17;
            speed = 11;
            name = "Lamborginy";}
        else
        if (index == 3){
            n2o = 10;
            speed = 13;
            name = "Mclaren";}
        else
        if (index == 4){
            n2o = 10;
            speed = 14;
            repst = true;
            name = "AstonMartin";}

    }

    public String toString(){
        return name+" with speed : " + speed + " n2o " + n2o;
    }

}


