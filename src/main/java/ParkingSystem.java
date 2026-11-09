public class ParkingSystem {

    private final int[] free = new int[4];

    public ParkingSystem(int big, int medium, int small) {
        free[1] = big;
        free[2] = medium;
        free[3] = small;
    }

    public boolean addCar(int carType) {
        if (carType < 1 || carType > 3) {
            return false;
        }
        if (free[carType] == 0) {
            return false;
        }
        free[carType]--;
        return true;
    }
}
