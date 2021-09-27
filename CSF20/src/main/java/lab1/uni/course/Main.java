package lab1.uni.course;

public class Main {
    public static void main(String[] args) throws ObjectCreatedException {
        Person person = new Person("Joe Dow");
        System.out.println(person.getName());

        Person nullName = new Person(null);
        System.out.println(nullName.getName());

        Person empty = new Person("");
        System.out.println(empty.getName());


        Lecturer lecturer = new Lecturer("Tom B", 1234);
        System.out.println(lecturer.getName());
        System.out.println(lecturer.getStaffId());

        Lecturer nullLecturer = new Lecturer(null, null);
        System.out.println(nullLecturer.getName());
        System.out.println(nullLecturer.getStaffId());

        Lecturer emptyLecturer = new Lecturer(null, 0);
        System.out.println(emptyLecturer.getName() + emptyLecturer.getStaffId());
    }

}
