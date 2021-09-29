package lab1.task3;

import lab1.util.ObjectCreatedException;

/**
 * Calling the method through a superclass reference behaves as expected
 * because at run time the compiler receives the method from the subclass
 * as it is an inheritance property
 */

public class MainT3 {
    public static void main(String[] args) throws ObjectCreatedException {
        PersonT3 personT3 = new LecturerT3("Joe Dow", 1234);
        personT3.sayHello();
    }

}
