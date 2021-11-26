
// Enum : Enum is just like a class that contains a list of constants.
// all the values in enum are mostly known at compile time.
// It is not necessary that the set of constants in an enum type stay fixed for all time.
//enum should be list of constants and then other things like methods, variables and constructor.

enum Day {
    // these are constants
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// this enum class with constructor
enum Size {
    // enum constants calling the enum constructor
    SMALL("Pizza size is small"),
    MEDIUM("Pizza size is Medium"),
    LARGE("Pizza size is Large"),
    EXTRA_LARGE("Pizza size is too large");

    private final String pizzaSize;
    Size(String pizzaSize){
        this.pizzaSize = pizzaSize;
    }

    public String getSize(){
        return pizzaSize;
    }
}

public class EnumDemo {
    Day day;

    public EnumDemo(Day day) {
        this.day = day;
    }

    public void checkMood() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are really bad! Let's go to office.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better! It's near to weekend");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best! Go to Multiplex");
                break;
            default:
                System.out.println("Oh no oh no.... oh no no....");
        }
    }


    public static void main(String[] args) {

        // accessing constants
        Day day = Day.MONDAY;
        System.out.println(day.name()); // MONDAY

        String str = "MONDAY";
        new EnumDemo(Day.valueOf(str)).checkMood();

        Size size = Size.EXTRA_LARGE;

        System.out.println(size.getSize());
        size = Size.MEDIUM;

        System.out.println(size.getSize());

    }
}
