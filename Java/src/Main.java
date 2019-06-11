public class Main {
    public static void main(String[] args) {
        randomNumber();
        sport();
        System.out.println("Hello world");

        Car carObj = new Car("Orange", 4);
        Car carObj2 = new Car("red", 5);

        System.out.println("The colour of you car is:" + carObj.colour);
        System.out.println("The number of wheels for your car is:" + carObj.wheels);
        System.out.println("The number of wheels for your car is:" + carObj2.wheels);
        array();
    }

    public static void array() {
        Manufacturer OEMS = new Manufacturer();
        String initialItem = OEMS.getItemFromArray(2);

        System.out.println("The initial value for the array is: " + initialItem);

       OEMS.changeValue(2, "Changed Item");
       String ChangedValue = OEMS.getItemFromArray(2);

       int totalLength = OEMS.getLength();

       for (int p = 0; p < totalLength; p++) {
           System.out.println(OEMS.getItemFromArray(p));
       }

//       while(totalLength < 6) {
//           System.out.println("The current length of the array is");
//       }

        System.out.println("The new value for the array third item in the array is: " + ChangedValue);

//        Limitations of Arrays in Java:
//        Fixed size. Can not be increased or decrease once declared.
//        the array occupies an amount of memory that is proportional to its size, independently of the number of elements that are actually of interest
//        Can store a single type of primitives only.
    }

    public static void sport() {
        Sport sport = new Sport();
        String finalChoice = sport.getSportChoice();
        System.out.println(finalChoice);

        sport.setSportChoice("Football");
        String changedChoice = sport.getSportChoice();
        System.out.println(changedChoice);
    }

    public static void randomNumber() {
        SuperClass ultimate = new SuperClass();
        ultimate.callMethod();

        SubClass lower = new SubClass();
        lower.callMethod();
    }
}
