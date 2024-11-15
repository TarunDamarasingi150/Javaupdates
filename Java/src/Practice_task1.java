
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Data> dataArray = new ArrayList<>();
        dataArray.add(new Data(1, "Mounika", "hyderabad", "3lpa"));
        dataArray.add(new Data(2, "Mounika2", "hyderabad2", "3lpa2"));
        dataArray.add(new Data(1, "Mounika", "hyderabad", "3lpa"));
        dataArray.add(new Data(1, "Mounika", "hyderabad", "3lpa"));
        dataArray.add(new Data(1, "Mounika", "hyderabad", "3lpa"));
        dataArray.add(new Data(3, "Mounika3", "hyderabad3", "3lpa"));
        dataArray.add(new Data(4, "Mounika3", "hyderabad4", "3lpa"));
        dataArray.add(new Data(1, "Mounika2", "hyderabad4", "3lpa"));
        dataArray.add(new Data(2, "Mounika2", "hyderabad4", "3lpa"));
        ArrayList<Data> newArray = new ArrayList<>();
        ArrayList<Data> uniqueArray = new ArrayList<>();

        for (int i = 0; i < dataArray.size(); i++) {
            Data dataIn = dataArray.get(i);
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueArray.size(); j++) {
                Data uniqueData = uniqueArray.get(j);
                if (dataIn.equals(uniqueData)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                newArray.add(dataIn);
            } else {
                uniqueArray.add(dataIn);
            }
        }

        System.out.println("Duplicate Values :-");
        for (Data data : newArray) {
            System.out.println(data);
        }
        System.out.println("--------------------------------------");
        System.out.println("Unique Values :-");
        for (Data data : uniqueArray) {
            System.out.println(data);
        }
    }
}

class Data {
    int id;
    String name;
    String place;
    String salary;

    Data(int id, String name, String place, String salary) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Data data = (Data) obj;
        return id == data.id &&
                name.equals(data.name) &&
                place.equals(data.place) &&
                salary.equals(data.salary);
    }

    @Override
    public String toString() {
        return "Data{id=" + id + ", name='" + name + "', place='" + place + "', salary='" + salary + "'}";
    }
}
