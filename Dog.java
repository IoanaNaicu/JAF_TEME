public class Dog {
    private String name;
    private int age;
    private char gender;
    private String race;
    private int weight;

    public Dog(String name, int age, char gender, String race, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog(char gender, String race){
        this("Bob", 4, gender, race, 6000);
    }


    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age not accepted");
        }
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight not accepted");
        }

          }

    @Override
    public String toString() {
        return name + " " + age + " " + gender + " " + race + " " + weight;
    }
}


