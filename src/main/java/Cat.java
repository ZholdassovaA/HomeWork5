public class Cat {
    public static String commonName = "Кошка";

    private String name;
    private int age;
    private int weight;
    Wool wool;

    public static class Wool {
        String color;
        public Wool(String color) {
            this.color = color;
        }
        public void sayColor() {
            System.out.println("My color is " + color);
        }
    }

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }


}





