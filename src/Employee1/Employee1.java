package Employee1;

public class Employee1 {
    int timeOfWorkPerDay;
    int salary;

    public void getInfo(int timeOfWorkPerDay, int salary) {
        this.timeOfWorkPerDay = timeOfWorkPerDay;
        this.salary = salary;
    }

    public void AddSal() {
        if (salary < 500) {
            salary = salary + 10;
        }
    }

    public void AddWork() {
        if (timeOfWorkPerDay > 6) {
            salary = salary + 5;
        }
    }

    @Override
    public String toString() {
        return "timeOfWorkPerDay=" + timeOfWorkPerDay + "        " + "salary=" + salary;
    }
}