package lab1.task3;

import lab1.util.ObjectCreatedException;

public class PersonT3 {
    private String name;

    public PersonT3(String name) throws ObjectCreatedException {
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


    public void sayHello(){
        System.out.println("hello");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
