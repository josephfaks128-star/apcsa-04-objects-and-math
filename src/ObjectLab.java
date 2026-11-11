public class ObjectLab {
    public static void main(String[] args) {
        Pet rex = new Pet("Rex", 3);
        Pet mia = new Pet("Mia");

        System.out.println(rex.getName() + " " + rex.getAge());
        System.out.println(mia.getName() + " " + mia.getAge());

        Pet copy = rex;
        copy.birthday();
        System.out.println(rex.getAge());
    }
}

// Given class. Read it, do not edit it. You will write classes like this in Unit 5.
class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name) {
        this.name = name;
        this.age = 1;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public void birthday() { age++; }
}
