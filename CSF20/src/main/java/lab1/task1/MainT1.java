package lab1.task1;

import lab1.util.ObjectCreatedException;

public class MainT1 {
    public static void main(String[] args) throws ObjectCreatedException {
        PersonT1 person = new PersonT1("Joe Dow");
        System.out.println(person.getName());

        PersonT1 nullName = new PersonT1(null);
        System.out.println(nullName.getName());

        PersonT1 empty = new PersonT1("");
        System.out.println(empty.getName());


        LecturerT1 lecturer = new LecturerT1("Tom B", 1234);
        System.out.println(lecturer.getName());
        System.out.println(lecturer.getStaffId());

        LecturerT1 nullLecturer = new LecturerT1(null, null);
        System.out.println(nullLecturer.getName());
        System.out.println(nullLecturer.getStaffId());

        LecturerT1 emptyLecturer = new LecturerT1(null, 0);
        System.out.println(emptyLecturer.getName() + emptyLecturer.getStaffId());

        LecturerT1 lecturerWithOffice = new LecturerT1("Rama", 123, "Computational Foundry 413");
    }

}
