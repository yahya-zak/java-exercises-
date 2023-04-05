package Employee2;

public class Employee2 {
    String name;
    int yearOfJoining;
    String address;
    int salary;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }
    public int getYearOfJoining(){
        return yearOfJoining;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return name + "            " + yearOfJoining + "            " + address + "            " + salary;
    }
}
