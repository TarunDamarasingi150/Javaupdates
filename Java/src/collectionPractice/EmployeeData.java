package collectionPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeData {
    public static ArrayList<Employee> get(){
        return new ArrayList<Employee>(Arrays.asList(
                new Employee(1,"madan","manohar","DEV","SC",24000,30,"male"),
                new Employee(2,"raju","Sundaram","DEV","VP",25000,40,"Male"),
                new Employee(3,"anandi","Vihari","ADMIN","VP",27000,45,"femAle"),
                new Employee(4,"swathi","Muthyam","HR","HR",30000,28,"Female"),
                new Employee(5,"murthy","gaaru","DEV","DBA",26000,40,"male"),
                new Employee(6,"murthy","gaaru","ADMIN","DEVOPS",26000,40,"male")

        ));
    }
}
