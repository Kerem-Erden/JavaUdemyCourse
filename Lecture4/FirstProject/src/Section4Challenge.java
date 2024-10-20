public class Section4Challenge {

    public static void main(String[] args) {

        //create a double variable 20.00
        double doubleVar = 20.00D;

        //create a double variable2 80.00
        double doubleVar2 = 80.00D;

        //and both numbers together then multiply 100.00 and remainder 40.00
        doubleVar = (doubleVar * 100.0D) % 40.00D;
        doubleVar2 = (doubleVar2 * 100.0D) % 40.00D;
        double doubleVar3 = (doubleVar + doubleVar2) % 40.00D;

        //create a boolean variable if remainder is 0 assign the true if isn't assign false
        boolean controlVar = (doubleVar3 == 0)  ? true : false;

        if (controlVar) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}
