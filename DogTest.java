public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Miki", 3, 'f', "bichon", 5000);
        Dog dog2 = new Dog('f', "doberman");

        System.out.println(dog1.getAge());
        dog1.setAge(4);
        System.out.println(dog2.getWeight());

        System.out.println(dog1);
        System.out.println(dog2);

        dog1.setWeight(-2);
        dog2.setAge(0);
    }
}
