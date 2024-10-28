package dslab5.tylere;
/**
 * Tester for Lab 5 - version 6
 * @author Stephen T. Brower<stephen.brower@raritanval.edu> Inspired by  Michael Main
 * updated by Linda Yang 6/2019
 */
public class GenericLinkedBagSimpleTestVer6
{
    /**
     * The main method is the program's starting point.
     * This is named main so that it can run standalone from the project.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // create bag of String  - fruitBag
        SinglyLinkedList<String> fruitBag = new SinglyLinkedList<String>();
        // create bag of Car - carBag
        SinglyLinkedList<Car> carBag = new SinglyLinkedList<Car>();

        // variables
        String stringToTest;
        Car carToTest;

        // display empty fruitBag
        displayLinkedBagStringAndSize(fruitBag,"fruitBag upon startup");
        // display empty carBag
        displayLinkedBagCarAndSize(carBag,"carBag upon startup");

        // add fruit to fruitBag
        addStringToBag(fruitBag, "Pear");
        addStringToBag(fruitBag, "Plum");
        addStringToBag(fruitBag, "Watermellon");
        addStringToBag(fruitBag, "Mango");
        addStringToBag(fruitBag, "Apple");
        addStringToBag(fruitBag, "Nectarine");
        addStringToBag(fruitBag, "Cherry");

        // display fruitBag after 7 adds
        displayLinkedBagStringAndSize(fruitBag,"\nfruitBag after 7 adds");


        addCarToBag(carBag, new Car(2017,"Honda Accord") );
        addCarToBag(carBag, new Car(2016,"Camry") );
        addCarToBag(carBag, new Car(2017,"Explorer") );
        addCarToBag(carBag, new Car(2016,"Zoom Zoom") );
        addCarToBag(carBag, new Car(2017,"Acura") );
        addCarToBag(carBag, new Car(2016,"Neon") );
        addCarToBag(carBag, new Car(1965,"Shelby Mustang GT 350") );
        addCarToBag(carBag, new Car(2016,"zOom zoOM") );

        // display carBag after 8 adds
        displayLinkedBagCarAndSize(carBag,"\ncarBag after 8 adds");


        // exists - String

        stringToTest = "Banana";
        // does stringToTest exist in fruitBag?
        if (fruitBag.exists(stringToTest))
            System.out.println("\nYes!  There is a " + stringToTest + " in the fruitBag!");
        else
            System.out.println("\nNo!  No " + stringToTest + " in the fruitBag");

        stringToTest = "Nectarine";
        // does stringToTest exist in fruitBag?
        if (fruitBag.exists(stringToTest))
            System.out.println("Yes!  There is a " + stringToTest + " in the fruitBag!");
        else
            System.out.println("No!  No " + stringToTest + " in the fruitBag");

        stringToTest = "Watermellon";
        // does stringToTest exist in fruitBag?
        if (fruitBag.exists(stringToTest))
            System.out.println("Yes!  There is a " + stringToTest + " in the fruitBag!");
        else
            System.out.println("No!  No " + stringToTest + " in the fruitBag");

        // exists - Car

        carToTest = new Car(2017,"Expedition");
        // does carToTest exist in carBag?
        if (carBag.exists(carToTest))
            System.out.println("\nYes!  There is a " + makeStringOfCar(carToTest) + " in the carBag!");
        else
            System.out.println("\nNo!  No " + makeStringOfCar(carToTest)  + " in the carBag");

        carToTest = new Car(2017,"Honda Accord");
        // does carToTest exist in carBag?
        if (carBag.exists(carToTest))
            System.out.println("Yes!  There is a " + makeStringOfCar(carToTest)  + " in the carBag!");
        else
            System.out.println("No!  No " + makeStringOfCar(carToTest)  + " in the carBag");

        carToTest = new Car(1965,"Shelby Mustang GT 350");
        // does carToTest exist in carBag?
        if (carBag.exists(carToTest))
            System.out.println("Yes!  There is a " + makeStringOfCar(carToTest)  + " in the carBag!");
        else
            System.out.println("No!  No " + makeStringOfCar(carToTest)  + " in the carBag");


        // remove       String

        //                          Banana
        stringToTest = "Banana";
        // show fruitBag before call to remove()
        displayLinkedBagStringAndSize(fruitBag,"\nfruitBag before removing " + stringToTest);

        // attempt to remove stringToTest from fruitBag
        if (fruitBag.remove(stringToTest))
            System.out.println("Was able to remove " + stringToTest + " from fruitBag.");
        else
            System.out.println("Sorry! unable to remove " + stringToTest + " from fruitBag!");

        // show fruitBag after call to remove()
        displayLinkedBagStringAndSize(fruitBag,"fruitBag after removing " + stringToTest);


        //                          Nectarine
        stringToTest = "Nectarine";
        // show fruitBag before call to remove()
        displayLinkedBagStringAndSize(fruitBag,"\nfruitBag before removing " + stringToTest);

        // attempt to remove stringToTest from fruitBag
        if (fruitBag.remove(stringToTest))
            System.out.println("Was able to remove " + stringToTest + " from fruitBag.");
        else
            System.out.println("Sorry! unable to remove " + stringToTest + " from fruitBag!");

        // show fruitBag after call to remove()
        displayLinkedBagStringAndSize(fruitBag,"fruitBag after removing " + stringToTest);


        //                          Watermellon
        stringToTest = "Watermellon";
        // show fruitBag before call to remove()
        displayLinkedBagStringAndSize(fruitBag,"\nfruitBag before removing " + stringToTest);

        // attempt to remove stringToTest from fruitBag
        if (fruitBag.remove(stringToTest))
            System.out.println("Was able to remove " + stringToTest + " from fruitBag.");
        else
            System.out.println("Sorry! unable to remove " + stringToTest + " from fruitBag!");

        // show fruitBag after call to remove()
        displayLinkedBagStringAndSize(fruitBag,"fruitBag after removing " + stringToTest);


        // remove       Car

        carToTest = new Car(2017,"Expedition");
        // show carBag before call to remove()
        displayLinkedBagCarAndSize(carBag,"\ncarBag before removing <" + makeStringOfCar(carToTest)  + ">");

        // attempt to remove stringToTest from carBag
        if (carBag.remove(carToTest))
            System.out.println("Was able to remove " + makeStringOfCar(carToTest)  + " from carBag.");
        else
            System.out.println("Sorry! unable to remove " + makeStringOfCar(carToTest)  + " from carBag!");

        // show carBag after call to remove()
        displayLinkedBagCarAndSize(carBag,"carBag after removing <" + makeStringOfCar(carToTest)  + ">");

        carToTest = new Car(2017,"Honda Accord");
        // show carBag before call to remove()
        displayLinkedBagCarAndSize(carBag,"\ncarBag before removing <" + makeStringOfCar(carToTest)  + ">");

        // attempt to remove stringToTest from carBag
        if (carBag.remove(carToTest))
            System.out.println("Was able to remove " + makeStringOfCar(carToTest)  + " from carBag.");
        else
            System.out.println("Sorry! unable to remove " + makeStringOfCar(carToTest)  + " from carBag!");

        // show carBag after call to remove()
        displayLinkedBagCarAndSize(carBag,"carBag after removing <" + makeStringOfCar(carToTest)  + ">");

        carToTest = new Car(1965,"Shelby Mustang GT 350");
        // show carBag before call to remove()
        displayLinkedBagCarAndSize(carBag,"\ncarBag before removing <" + makeStringOfCar(carToTest)  + ">");

        // attempt to remove stringToTest from carBag
        if (carBag.remove(carToTest))
            System.out.println("Was able to remove " + makeStringOfCar(carToTest)  + " from carBag.");
        else
            System.out.println("Sorry! unable to remove " + makeStringOfCar(carToTest)  + " from carBag!");

        // show carBag after call to remove()
        displayLinkedBagCarAndSize(carBag,"carBag after removing <" + makeStringOfCar(carToTest)  + ">");

    }

    /**
     * displaySize method displays the size of a bag
     * @param bagToDisplay the 'bag' whose size we want to show
     * @param label String to display before displaying bag
     */
    public static void displaySize(SinglyLinkedList bagToDisplay, String label)
    {
        System.out.println(label + "\tSize: " + bagToDisplay.getSize());
    }

    /**
     * displayLinkedBagStringAndSize method displays Cars from a LinkedBag<String>
     * using an iterator
     * @param bagToDisplay the LinkedBag<String> to display
     * @param label String to display before displaying bag
     */
    public static void displayLinkedBagStringAndSize(SinglyLinkedList<String> bagToDisplay, String label)
    {
        System.out.print(label + ": [" );

        if (bagToDisplay.getSize() == 0)
            System.out.print("--Empty--");
        Lister<String> stringList = bagToDisplay.iterator();
        while (stringList.hasNext())
        {
            System.out.print("{" + stringList.next() + "}");
            if (stringList.hasNext())
                System.out.print( ", ");
        }

        System.out.println("]\tSize: " + bagToDisplay.getSize() + "\n");
    }

    /**
     * displayLinkedBagCarAndSize method displays Cars from a LinkedBag<Car>
     * using an iterator
     * @param bagToDisplay the LinkedBag<Car> to display
     * @param label String to display before displaying bag
     */
    public static void displayLinkedBagCarAndSize(SinglyLinkedList<Car> bagToDisplay, String label)
    {
        System.out.print(label + ": [" );


        if (bagToDisplay.getSize() == 0)
            System.out.print("--Empty--");
        Lister<Car> carList = bagToDisplay.iterator();
        while (carList.hasNext())
        {
            Car displayCar = carList.next();
            System.out.print("{" + displayCar.getYearModel() + " " + displayCar.getMake() + " -- " + displayCar.getSpeed() + "}");
            if (carList.hasNext())
                System.out.print( ", ");
        }

        System.out.println("]\tSize: " + bagToDisplay.getSize() + "\n");
    }

    /**
     * addStringToBag method adds a String object to a LinkedBag<String>
     * @param bagToAddTo the LinkedBag<String> to add to
     * @param stringToAdd the car to add to the LinkedBag<String>
     */
    public static void addStringToBag(SinglyLinkedList<String> bagToAddTo,
                                        String stringToAdd )
    {
        bagToAddTo.prependList(stringToAdd);
        displaySize(bagToAddTo,"added [" + stringToAdd + "]...");

    }

    /**
     * addCarToBag method adds a Car object to a LinkedBag<Car>
     * @param bagToAddTo the LinkedBag<Car> to add to
     * @param carToAdd the car to add to the LinkedBag<Car>
     */
    public static void addCarToBag(SinglyLinkedList<Car> bagToAddTo,
                                        Car carToAdd )
    {
        bagToAddTo.appendList(carToAdd);
        displaySize(bagToAddTo,"added [" + makeStringOfCar(carToAdd) + "]...");

    }

    /**
     * makeStringOfCar method makes a String from a Car
     * @param carToConvert is the car to be made into a String
     * return a String representation of a Car
     */
    public static String makeStringOfCar( Car carToConvert )
    {
        return "[Car " + carToConvert.getYearModel() +" "+ carToConvert.getMake()+"]";
    }
}
