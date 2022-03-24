public class lesson1 {
    public static void main(String[] args) {
        Course course;
        Team team;

        System.out.println("Здравствуйте, дорогие зрители! Сегодня здесь проходит соревнование космического машстаба!");
        course = new Course();
        System.out.println("Все желающие могут записаться для участия! (Если этих желающих не более четырёх)");
        System.out.println();
        team = new Team("Супер-мега-крутая-команда");
        course.doIt(team, course);
        team.showResults();



    }
}
