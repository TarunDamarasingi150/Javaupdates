package collectionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamsPractice {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.get();

        //1. print list of all employess by using streams
//        employees.stream()
//                .forEach(e -> System.out.println(e));

        //2. salary >20k and last name starts with "m"

//        employees.stream()
//                .filter(e -> e.getSalary() > 20000)
//                .filter(e -> e.getLastname().startsWith("m"))
//                .forEach(e -> System.out.println(e));

        //3. Sort by First Name

//        employees.stream()
//                .sorted((e1,e2)-> e1.getFirstname().compareTo(e2.getFirstname()))
//                .forEach(e-> System.out.println(e));

        //4. only first names in sorted order (transform names)

//        employees.stream()
//                .map(e -> e.getFirstname())
//                .distinct()
//                .sorted()
//                .forEach(e-> System.out.println(e));



        //5. Count of Employees in DEV Department

//        System.out.println(
//                employees.stream()
//                        .filter(e-> e.getDepartment().equals("DEV"))
//                        .count()
//        );


        //6. Sum of all Salaries in DEV Department

//        System.out.println(
//                employees.stream()
//                        .filter(e-> e.getDepartment().equals("DEV"))
////                        .map(e -> e.getSalary())
////                        .reduce(0.0, (e,carry)-> e+carry)
//                //or
//                        .mapToDouble(e-> e.getSalary())
//                        .sum());



        //max salary of the employee

        //list of employees firstnames
        List<String> empnames = employees.stream()
                .map(e -> e.getFirstname())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(empnames);

        //immutable list of names



    }
}
