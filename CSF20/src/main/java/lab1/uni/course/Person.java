package lab1.uni.course;

public class Person {
    private String name;

    public Person(String name) throws ObjectCreatedException {
        setName(name);
        System.out.println("person constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws ObjectCreatedException {
        if(name != null && !name.equals("")) {
            this.name = name;
        } else {
            throw new ObjectCreatedException("Name must not be empty");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
