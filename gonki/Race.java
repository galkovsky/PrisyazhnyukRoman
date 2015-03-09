
public class Race {
    Car[] cars;
    int length;

    public Race(int length, Car[] cars) {
        this.length = length;
        this.cars = cars;
    }

    public void start() {
        System.out.println("tree...two...one... Start!!!");
        int z = 1;
        int x = 0; String xc = "1";
        int y = 0; String yc = "1";
        int f = 0; String fc = "1";
        int c = 0; String cc = "1";
        int omt = 0; int nom = 1;
        int c1=0; int c2=0; int c3=0; int c4=0;
        while (true) {
            for (int i = 0; i < cars.length; i++) {
                if (cars[i].status == false){
                if((Math.random()*100)>95){
                    cars[i].pok = true;
                    if (cars[i].repst==true){System.out.println(cars[i].name+" Broken. "+"Thats car is cheeter, it can repair itself 1 time.");}else
                    {System.out.print(cars[i].name+" Broken");}
                    cars[i].status = true;
                    if (cars[0].pok == true){c1 =cars[0].position ;}
                    if (cars[1].pok == true){c2 =cars[1].position ;}
                    if (cars[2].pok == true){c3 =cars[2].position ;}
                    if (cars[3].pok == true){c4=cars[3].position ;}
                                 }}
                cars[i].move();
                int vas = i + 1;
                omt++;

                if (cars[0].pok == true&cars[0].status == true){cars[0].position =c1 ;}
                if (cars[1].pok == true&cars[1].status == true){cars[1].position= c2 ;}
                if (cars[2].pok == true&cars[2].status == true){cars[2].position=c3 ;}
                if (cars[3].pok == true&cars[3].status == true){cars[3].position=c4 ;}


                if (cars[i].position >= length&cars[i].status ==false) {


                    cars[i].status = true;
                    if (z == 1) {
                        x = cars[i].position;
                        xc = cars[i].name;
                    }
                    if (z == 2) {
                        y = cars[i].position;
                        yc = cars[i].name;}
                    if (z == 3) {
                        f = cars[i].position;
                        fc = cars[i].name;}
                    if (z == 4) {
                        c = cars[i].position;
                        cc = cars[i].name;}
                    ++z;

                }
                if (cars[1].status == false || cars[2].status == false || cars[3].status == false || cars[0].status == false) {
                    System.out.print("     " + vas + ")  " + cars[i].position + " ");}
                if (cars[1].status == true || cars[2].status == true || cars[3].status == true || cars[0].status == true) {
                }

                if (i == 3&(cars[1].status == false || cars[2].status == false || cars[3].status == false || cars[0].status == false)) {System.out.println();}

                if (i == 3) {
                         //если приехали одновременно
                    for (int j = 0; j < 30; j++) {
                        if ((x==y||x==f||x==c)&x!=0){ System.out.println();
                            System.out.println(" (finish line) "+x +" "+y+" "+f+" "+c+" "+xc + "  has been finished " +nom+ " and drinking Vodka");
                            cars[j].pok = true;
                            x = 0;}
                        if ((y==x||y==f||y==c)&y!=0){System.out.println();
                            System.out.println(" (finish line) "+x +" "+y+" "+f+" "+c+" "+yc + "  has been finished " +nom+ " and drinking Vine");
                            cars[j].pok = true;
                            y = 0;}
                        if ((f==x||f==y||f==c)&f!=0){System.out.println();
                            System.out.println(" (finish line) "+x +" "+y+" "+f+" "+c+" "+fc + " has been finished " +nom+ " and drinking Beer");
                            cars[j].pok = true;
                            f = 0;}
                        if ((c==x||c==y||c==f)&c!=0){System.out.println();
                            System.out.println(" (finish line) "+x +" "+y+" "+f+" "+c+" "+cc + "  has been finished " +nom+ " and drinking juice");
                            cars[j].pok = true;
                            c = 0;}
                         //если приехал быстрее
                        if (x > y & x > f & x > c) {
                            System.out.println(" (finish line) "+x +" "+y+" "+f+" "+c+" "+xc + "  has been finished " +nom+ " and drinking Vodka");
                            cars[j].pok = true; nom= nom +1;
                            x = 0;}
                        if (y > x & y > f & y > c ) {
                            System.out.println(" (finish line) "+x +" "+y+" "+f+" "+c+" "+yc + "  has been finished " +nom+ " and drinking Vine");
                            cars[j].pok = true; nom= nom +1;
                            y = 0;}
                        if (f > x & f > y & f > c) {
                            System.out.println(" (finish line) "+x +" "+y+" "+f+" "+c+" "+fc + " has been finished " +nom+ " and drinking Beer");
                            cars[j].pok = true; nom= nom +1;
                            f = 0;}
                        if (c > x & c > f & c > y) {
                            System.out.println(" (finish line) "+x +" "+y+" "+f+" "+c+" "+cc + "  has been finished " +nom+ " and drinking juice");
                            cars[j].pok = true; nom= nom +1;
                            c = 0;}
                    }
                }
                if (cars[i].repst == true& cars[i].pok == true){ System.out.print(cars[i].name+" Fixed ");
                    cars[i].status = false;
                    cars[i].repst = false;
                    cars[i].pok = false;}

                if ( (cars[0].pok == true & cars[1].pok== true & cars[2].pok == true  & cars[3].pok == true)||omt ==150) {
                    return; } else { continue;}





            }



        }

         }
}


