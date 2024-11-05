package collectionPractice;

public class lambdaExpressions {
    public static void main(String[] args) {
        //creating an anonymous inner class based on Class "Car" at below

        car c1 = new car() {
            @Override
            public void drive() {
                System.out.println("Drive BMW");
            }
        };
        c1.drive();

        //Lambda Expression with Anonymous Class
        car c2 =()-> {System.out.println("Drive Lambda Anonymous BMW");};

        // or we can write it as this type also, endukante..{ } lopala , single condition unte, { } ni tiseyachu
        //car c2 =()-> System.out.println("Drive Lambda Anonymous BMW");
                    c2.drive();

        //for interface represenrted below
        Audi au = new Audi();
        au.drive();
    }
}

class Audi implements car{
    public void drive(){
        System.out.println("Driving AUdi");
    }
}

@FunctionalInterface

interface car{
    public void drive();
}
