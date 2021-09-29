package lab1.task2;

import lab1.util.ObjectCreatedException;

public class MainT2 {
    public static void main(String[] args) throws ObjectCreatedException {
        PersonT2 person = new PersonT2("Joe Dow");
        System.out.println(person.getName());

        PersonT2 nullName = new PersonT2(null);
        System.out.println(nullName.getName());

        PersonT2 empty = new PersonT2("");
        System.out.println(empty.getName());


        LecturerT2 lecturer = new LecturerT2("Tom B", 1234);
        System.out.println(lecturer.getName());
        System.out.println(lecturer.getStaffId());

        LecturerT2 nullLecturer = new LecturerT2(null, null);
        System.out.println(nullLecturer.getName());
        System.out.println(nullLecturer.getStaffId());

        LecturerT2 emptyLecturer = new LecturerT2(null, 0);
        System.out.println(emptyLecturer.getName() + emptyLecturer.getStaffId());

        LecturerT2 lecturerWithOffice = new LecturerT2("Rama", 123, new OfficeLocation("Computational Foundry", "413"));
        System.out.println(lecturerWithOffice);
    }

}
