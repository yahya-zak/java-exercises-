package Employee2;


//Write a program that would print the information (name, year of joining, salary, address)
// of three employees by creating a class named 'Employee'. The output should be as follows:
//        Name        Year of joining        Address
//        Robert            1994                64C- WallsStreat
//        Sam                2000                68D- WallsStreat
//        John                1999                26B- WallsStreat
public class Main {
    public static void main(String[] args) {
        Employee2 n1=new Employee2();
        Employee2 n2=new Employee2();
        Employee2 n3=new Employee2();
        n1.setName("Robert");
        n1.setYearOfJoining(1994);
        n1.setAddress("64C- WallsStreet");
        n1.setSalary(3500);

        n2.setName("Sam");
        n2.setYearOfJoining(2000);
        n2.setAddress("68d- WallsStreet");
        n2.setSalary(3000);

        n3.setName("John");
        n3.setYearOfJoining(1999);
        n3.setAddress("26B- WallsStreet");
        n3.setSalary(2500);

        System.out.println("Name       Year of joining        Address       Salary");
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n3.toString());

    }
}

