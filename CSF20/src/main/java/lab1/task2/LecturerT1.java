package lab1.task2;

import lab1.util.ObjectCreatedException;

public class LecturerT1 extends PersonT1 {
    private Integer staffId;
    private String officeLocation;

    public LecturerT1(String name, Integer staffId) throws ObjectCreatedException {
        super(name);
        setStaffId(staffId);
        System.out.println("lecturer constructor");
    }

    public LecturerT1(String name, Integer staffId, String officeLocation) throws ObjectCreatedException {
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
    public String toString() {
        return "Lecturer{" +
                "staffId=" + staffId +
                '}';
    }
}
