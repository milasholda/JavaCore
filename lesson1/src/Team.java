public class Team {
    private final String title;
    TeamMember[] team;

    Team(String title) {
        this.title = title;
        this.team = new TeamMember[4];
        team[0] = new TeamMember("Наруто");
        team[1] = new TeamMember("Галадриэль");
        team[2] = new TeamMember("Чёрная Вдова");
        team[3] = new TeamMember("Соник");
    }

    public void showResults() {
        System.out.println("Команда '" + this.title + "' прошла полосу препятствий.");
        System.out.println("Но не все герои смогли дойти до конца.");
        System.out.println("Те, кто выдержал эти испытания, стали поистине Великими. И это:");
        for (int i = 0; i < 4; i++) {
            if (team[i].isPassedTheCourse()) {
                System.out.println(team[i].getName());
            }
        }
        System.out.println();
        System.out.println("Спасибо всем участникам и зрителям. Мероприятие спонсировано ОАО 'Братство Кольца'.");
    }

    public int getGetJumpHeight(int a) {
        return team[a].getJumpHeight();
    }

    public void setSetPassedTheCourse( int a) {
        team[a].setPassedTheCourse(false);
    }
}
