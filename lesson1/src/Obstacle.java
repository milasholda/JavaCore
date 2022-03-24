import java.util.Random;
public class Obstacle {
    public static Random random = new Random();
    private final int height;

    Obstacle() {
        this.height = randomValue(76, 91);
//        System.out.println("*шепотом* Поставили препятствие, его высота - " + getHeight());
    }

    public int getHeight() {
        return height;
    }

    public static int randomValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }
}
