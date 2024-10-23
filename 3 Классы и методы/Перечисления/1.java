/**
 * @author Ivan Shupayev
 */
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class Week {
    private Day today;

    public Week(Day day) {
        this.today = day;
    }

    public void printDayMessage() {
        switch (today) {
            case MONDAY:
                System.out.println("Сегодня понедельник, начало новой недели!");
                break;
            case FRIDAY:
                System.out.println("Сегодня пятница, выходные на подходе!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Сегодня выходной день!");
                break;
            default:
                System.out.println("Сегодня рабочий день.");
                break;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Week week = new Week(Day.MONDAY);
        week.printDayMessage();

        Week weekend = new Week(Day.SATURDAY);
        weekend.printDayMessage();
    }
}
