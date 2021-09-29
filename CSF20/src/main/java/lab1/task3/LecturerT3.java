package lab1.task3;

import lab1.util.ObjectCreatedException;

public class LecturerT3 extends PersonT3 {
    private Integer staffId;
    private String officeLocation;

    public LecturerT3(String name, Integer staffId) throws ObjectCreatedException {
        super(name);
        setStaffId(staffId);
        System.out.println("lecturer constructor");
    }

    public LecturerT3(String name, Integer staffId, String officeLocation) throws ObjectCreatedException {
        super(name);
        setStaffId(staffId);
        this.officeLocation = officeLocation;
        System.out.println("lecturer constructor");
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) throws ObjectCreatedException {
        if (staffId != null && staffId != 0) {
            this.staffId = staffId;
        } else {
            throw new ObjectCreatedException("Staff Id can't be null");
        }
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    @Override
    public void sayHello(){
        System.out.println("hello you");
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "staffId=" + staffId +
                '}';
    }
}
