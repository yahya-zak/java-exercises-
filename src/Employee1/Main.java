package Employee1;

/*Write a program by creating an 'Employee' class having the
following methods and print the final salary.

1 - 'getInfo()' which takes the salary, number of hours of
work per day of employee as parameter

2 - 'AddSal()' which adds $10 to salary of the employee if
 it is less than $500.

3 - 'AddWork()' which adds $5 to salary of employee if the
 number of hours of work per day is more than 6 hours.

 */
public class Main {
    public static void main(String[] args) {
        Employee1 n1 = new Employee1();
        Employee1 n2 = new Employee1();
        Employee1 n3 = new Employee1();
        Employee1 n4 = new Employee1();

        n1.getInfo(6,320);
        n2.getInfo(5,400);
        n3.getInfo(7,500);
        n4.getInfo(7,420);

        System.out.println("no AddSal & AddWork");
        System.out.println("1 "+n1.toString());
        System.out.println("2 "+n2.toString());
        System.out.println("3 "+n3.toString());
        System.out.println("4 "+n4.toString());

        n1.AddSal();
        n2.AddSal();
        n3.AddSal();
        n4.AddSal();

        n1.AddWork();
        n2.AddWork();
        n3.AddWork();
        n4.AddWork();

        System.out.println("with AddSal & AddWork");
        System.out.println("1 "+n1.toString());
        System.out.println("2 "+n2.toString());
        System.out.println("3 "+n3.toString());
        System.out.println("4 "+n4.toString());
    }
}