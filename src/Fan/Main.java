package Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        Fan fan2=new Fan();
        fan1.getON();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.toString());
        fan2.getOff();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2.toString());



    }
}
