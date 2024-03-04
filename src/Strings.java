public class Strings {
    public static void main(String[] args) {
        //literal way
        String name = "Peris";
        System.out.println(name);
        //new keyword
        String country = new String("Kenya");
        System.out.println(country);
        System.out.println();
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        String collection = new String(arr);
        System.out.println(arr);

        //access the length of a string -> returning an integer
        String school = "Kimathi";
        int lengths = school.length();
        System.out.println("The length of " + school + " is " + lengths);

        //concatenation -> joining two strings
        //stack , heap
        String classes = "Java Classes ";
        String amazing = "are amazing";
        String amazingClasses = classes + amazing;
        System.out.println(amazingClasses);
        //method 2
        String grandMother = "grand ".concat("mother");
        System.out.println(grandMother);

        //comparison
        //stack, heap - ferrari, ferrari
        //bad way
        String car = "ferrari";
        String car2 ="ferrari";
        boolean isEqual = (car==car2);
        System.out.println("are they equal: " + isEqual);
        //best way
        if (car.equals(car2)){
            System.out.println("They ar equal");
        }
        else{
            System.out.println("They are not equal");
        }
        String session = "SEssion";
        String session2 = "session";
        if (session.equalsIgnoreCase(session2)){
            System.out.println("They are equal ignoring the case");
        }else{
            System.out.println("Not equal");
        }
        //.endEndwiths()
        //conversion -> uppercase, lowercase
        String fruit = "banana";
        //convert it to uppercase
        System.out.println(fruit.toUpperCase());
        String fruitToUppercase = fruit.toUpperCase();
        System.out.println(fruitToUppercase);
        //to lowercase
        String orange = "ORANGE".toLowerCase();
        System.out.println(orange);
        //My name is Java -> 0, 1, 2, 3, 4, 5, 6
        String container = "My name is Java";
        int names = container.indexOf("Java");
        System.out.println(names);
        //String java = container.indexOf("java");
//        int is = container.indexOf(4, 7);
        String splitting = "I am a junior developer";


    }
}
