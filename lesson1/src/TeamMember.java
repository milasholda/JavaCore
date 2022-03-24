import java.util.Random;
public class TeamMember {
    public static Random random = new Random();
    private final String name;
    private final int jumpHeight;
    private boolean passedTheCourse;

    TeamMember(String name) {
        this.name = name;
        this.jumpHeight = randomValue(80, 100);
        this.passedTheCourse = true;
        System.out.println(name + " записан/а в команду.");
        System.out.println("* Высота её/его прыжка - " + getJumpHeight());
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setPassedTheCourse(boolean passedTheCourse) {
        this.passedTheCourse = passedTheCourse;
    }

    public boolean isPassedTheCourse() {
        return passedTheCourse;
    }

    public static int randomValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }
}
