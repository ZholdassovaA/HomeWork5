public class Main {
    public static void main(String[] args) {

        Cat persik = new Cat("Персик", 5, 4);
        String persikName = persik.getName();
        int persikAge = persik.getAge();
        int persikWeight = persik.getWeight();

        System.out.println(Cat.commonName);

        System.out.println("Name :" + persikName);
        System.out.println("Age :" + persikAge);
        System.out.println("Weight :" + persikWeight);

        persik.wool = new Cat.Wool("green");
        persik.wool.sayColor();
    }
}