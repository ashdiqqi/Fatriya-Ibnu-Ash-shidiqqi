public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        if (age >= 18 && age <= 30) {
            return age;
        } else {
            return -1;
        }
    }
}