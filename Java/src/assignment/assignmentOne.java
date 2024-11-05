package assignment;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


class assignmentOne{
    public static void main(String[] args) {
        ArrayList<Data> dataarray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of entries:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<n;i++){
            System.out.println("enter the Details");
            System.out.println("enter the ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("enter the name: ");
            String name = scanner.nextLine();
            System.out.println("enter the place: ");
            String place = scanner.nextLine();
            System.out.println("enter the Salary: ");
            String salary = scanner.nextLine();
            System.out.println("enter the gender: ");
            String gender = scanner.nextLine();
            dataarray.add(new Data(id,name,place,salary,gender));
        }

        ArrayList<Data> duplicates = new ArrayList<>();
        ArrayList<Data> unique = new ArrayList<>();

        for (Data eachdata : dataarray){
            if(unique.contains(eachdata)){
                duplicates.add(eachdata);
            }else {
                unique.add(eachdata);
            }
        }

        System.out.println("Print Duplicates: ");
        for(Data eachdata : duplicates){
            System.out.println(eachdata);
        }

        System.out.println("Print Unique Data");
        for(Data eachdata : unique){
            System.out.println(eachdata);
        }

        System.out.println("Salaries by gender:");
        System.out.println("Salary for Male:");
        for(Data eachdata : unique){
            if (eachdata.gender.toLowerCase().equals("male")){
                System.out.println(eachdata.name);
                System.out.println(eachdata.salary);
            }
        }
        System.out.println("Salary for Female:");
        for(Data eachdata : unique){
            if (eachdata.gender.toLowerCase().equals("female")){
                System.out.println(eachdata.name);
                System.out.println(eachdata.salary);
            }
        }
        scanner.close();
    }
}




class Data{

    int id;
    String name;
    String place;
    String salary;
    String gender;

    public Data(int id,String name,String place,String salary,String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.place = place;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", salary='" + salary + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return id == data.id && Objects.equals(name, data.name) && Objects.equals(place, data.place) && Objects.equals(salary, data.salary) && Objects.equals(gender, data.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, place, salary, gender);
    }
}



