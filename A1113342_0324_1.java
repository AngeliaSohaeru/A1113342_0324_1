import java.util.Scanner;

class animal {
    String name;
    double height;
    int weight;
    int speed;
    double x;
    double y;
    int z;
    Scanner sc = new Scanner(System.in);

    double distance() {
        System.out.println("Enter time (minute) and acceleration = ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        x = x * this.speed * y ;
        System.out.println("Distance = " + x + "\n");
        return x;
    }

    int distance2() {
        System.out.println("Enter only time (minute) = ");
        z = sc.nextInt();
        z = z * this.speed;
        System.out.println("Distance (only time) = " + z + "\n \n");
        return z;
    }
}

public class A1113342_0324_1 {
    public static void main (String [] args) {
        animal an1, an2, an3, an4;
        an1 = new animal();
        an2 = new animal();
        an3 = new animal();
        an4 = new animal();

        an1.name = "Olaf";
        an1.height = 1.1;
        an1.weight = 52;
        an1.speed = 100;
        System.out.println(an1.name + "\n" + "Height " + an1.height + "\t" + "Weight " + an1.weight + "\t" + "Speed " + an1.speed);
        an1.distance();
        an1.distance2();

        an2.name = "Donkey";
        an2.height = 1.5;
        an2.weight = 99;
        an2.speed = 200;
        System.out.println(an2.name + "\n" + "Height " + an2.height + "\t" + "Weight " + an2.weight + "\t" + "Speed " + an2.speed);
        an2.distance();
        an2.distance2();

        an3.name = "Anna";
        an3.height = 1.7;
        an3.weight = 48;
        an3.speed = 120;
        System.out.println(an3.name + "\n" + "Height " + an3.height + "\t" + "Weight " + an3.weight + "\t" + "Speed " + an3.speed);
        an3.distance();
        an3.distance2();

        an4.name = "Elsa";
        an4.height = 1.7;
        an4.weight = 50;
        an4.speed = 120;
        System.out.println(an4.name + "\n" + "Height " + an4.height + "\t" + "Weight " + an4.weight + "\t" + "Speed " + an4.speed);
        an4.distance();
        an4.distance2();
    }
}
