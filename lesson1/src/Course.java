public class Course {
    private Obstacle[] course;

    Course() {
        this.course = new Obstacle[5];
        course[0] = new Obstacle();
        course[1] = new Obstacle();
        course[2] = new Obstacle();
        course[3] = new Obstacle();
        course[4] = new Obstacle();
    }

    public void doIt(Team team, Course course) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (team.getGetJumpHeight(i) < course.getGetHeight(j)) {
                    team.setSetPassedTheCourse(i);
                }
            }
        }
    }
    public int getGetHeight(int a) {
        return course[a].getHeight();
    }
}
