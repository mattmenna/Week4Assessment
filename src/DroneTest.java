public class DroneTest {

    public static void main(String[] args) {
        Drone d1 = new QuadrotorDrone (5, 5, 5);
        Drone d2 = new QuadrotorDrone (0, 0, 0);
        d2.setX(2);
        d2.setY(2);
        d2.setZ(0);

        for (int n = 1; n <= 5; n++) {
            d1.fly(1, 1, 0);
            d2.fly(0, 0, 1);
            System.out.println("====Round " + n + "====");
            System.out.println("Drone 1: " + d1.getX() + ", " + d1.getY() + ", " + d1.getZ());
            System.out.println("Drone 2: " + d2.getX() + ", " + d2.getY() + ", " + d2.getZ());
        }

    }

}