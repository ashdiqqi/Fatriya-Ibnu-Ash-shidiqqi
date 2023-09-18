public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);

        System.out.println("Name : " + encap.getName());

        int age = encap.getAge();
        if (age == -1) {
            System.out.println("Usia tidak valid");
        } else {
            System.out.println("Age : " + age);
        }
    }
}