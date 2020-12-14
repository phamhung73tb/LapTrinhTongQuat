
public class Person implements Comparable {
    private String name;
    private int age;
    private String address;

    public Person() {

    }

    /**
     * Ham khoi tao.
     *
     * @param name    ten
     * @param age     tuoi
     * @param address dia chi
     */
    public Person(String name, int age, String address) {
        this.address = address;
        this.age = age;
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Ham so sanh.
     *
     * @param o Object
     * @return gia tri so sanh
     */
    @Override
    public int compareTo(Object o) {
        Person person1 = (Person) o;
        String nameOfPerson = person1.getName();
        int ageOfPerson1 = person1.getAge();
        if (getName().compareTo(nameOfPerson) == 0) {
            return getAge() - ageOfPerson1;
        }
        if (getName().compareTo(nameOfPerson) < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
 