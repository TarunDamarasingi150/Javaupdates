package collectionPractice;

import java.util.*;
import java.util.stream.Collectors;

public class streamCollectorsDemo {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.get();

        //1.  Concat the first names of all the employees
        String employeeFirstNames = employees.stream()
                //.map(Employee::getFirstname)
                .map(Employee::getFirstname)
                .collect(Collectors.joining(", "));

        System.out.println("employeeFirstNames : "+employeeFirstNames);
        System.out.println("---------------------------------------");
    //2. Employees with morethan 25k salary

        var salariesMorethan25k = employees.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > 25000.00, Collectors.counting()));
        System.out.println("salariesMorethan25k : "+salariesMorethan25k);
        System.out.println("---------------------------------------");

        //3. get Employees by department wise & get employee count department wise

        var employeesByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employeesByDepartment);
        var employeesCountByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(employeesCountByDepartment);
        System.out.println("---------------------------------------");

        //4. get Employess by Department with their names as (Collectors - nested Collectors principle will be applied here)

        var employeesByDepartmentFirstname = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getFirstname, Collectors.toList())));
        System.out.println(employeesByDepartmentFirstname);
        System.out.println("---------------------------------------");

        //5. get Employees Department wise, get the sum of salaries of employees by Department Wise

        var employeesDepartmentwiseTotalSalaries = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.mapping(Employee::getSalary, Collectors.reducing(Double::sum))));
        System.out.println(employeesDepartmentwiseTotalSalaries);
        //you can write the code in other way too!
        var employeesDepartmentwiseTotalSalaries2 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summarizingDouble(Employee::getSalary)));
        System.out.println(employeesDepartmentwiseTotalSalaries2);


        System.out.println("---------------------------------------");

        //6. get Employees FUll Names as based on Gender
        var employessFullNamesbasedOnGender = employees.stream().distinct().collect(Collectors.groupingBy(e -> e.getGender().toLowerCase(),
                Collectors.mapping(e -> e.getFirstname() + " " + e.getLastname(), Collectors.toList())));
        System.out.println("Employess full names based on gender: "+ employessFullNamesbasedOnGender);

        // 7. statistics of salaries of DEV Department only

        var statisticsOfDevDepartment = employees.stream().collect(Collectors.filtering(e -> e.getDepartment().equals("DEV"), Collectors.summarizingDouble(Employee::getSalary)));
        System.out.println("DEV Department Statistics : "+statisticsOfDevDepartment);
        System.out.println("_______________________________");

        //8. statistics of salaries of FemaleDepartment only

        var staticsOfFemaleSalaries = employees.stream().collect(Collectors.filtering(e -> e.getGender().equalsIgnoreCase("female"), Collectors.summarizingDouble(Employee::getSalary)));

        System.out.println("Female Salaries Statistics : "+staticsOfFemaleSalaries);
        System.out.println("_______________________________");

        //9. employee with highest age

        var employeeWithHighAge = employees.stream().max(Comparator.comparingInt(Employee::getAge));
        System.out.println("Employee with High age Details : "+employeeWithHighAge);

        //10. emploee with lowest age

        var employeeWithLowAge = employees.stream().min(Comparator.comparingInt(Employee::getAge));
        System.out.println("Employee with Low age Details : "+employeeWithLowAge);
        System.out.println("_______________________________");

        //11. Name of the employee with highest salary

        var employeeWithHighestSalary = employees.stream().collect(Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                       empOpt -> empOpt.map(Employee::getFirstname)));
        System.out.println("Employee with Highest Salary :"+employeeWithHighestSalary);
    }
}

