/**
 * Практика #1: Пример использования спецификаторов доступа.
 *
 * @author Ivan Shupayev
 */
class Human {
    public Human(String name, String surname, int age) {
        name_ = name;
        surname_ = surname;
        age_ = age;
    }

    public void Greeting() {
        System.out.println("Hello! My name is " + name_ + " " + surname_);
    }

    public void GoBar() {
        if (IsAdult()) {
            System.out.println("I go to bar");
        } else {
            System.out.println("I can't go to bar");
        }
    }

    protected String name_;
    protected String surname_;
    protected int age_;

    protected boolean IsAdult() {
        return age_ >= 18;
    }
}

class Student extends Human {
    public Student(String name, String surname, int age, String university) {
        super(name, surname, age);
        this.university = university;
    }

    public void ShowUniversity() {
        System.out.println(name_ + " studies at " + university);
    }

    private String university;
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Ivanov", 18, "SPbSTU");
        student.Greeting();
        student.GoBar();
        student.ShowUniversity();
    }
}
