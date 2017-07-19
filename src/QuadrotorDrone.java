public class QuadrotorDrone extends Drone {

    public QuadrotorDrone(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    public void fly(int x1, int y1, int z1) {
        super.setX(super.getX()+ x1);
        super.setY(super.getY()+ y1);
        super.setZ(super.getZ()+ z1);
    }
}
