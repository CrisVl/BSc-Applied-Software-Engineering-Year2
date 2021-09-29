package lab1.task2;

import lab1.util.ObjectCreatedException;

public class LecturerT2 extends PersonT2 {
    private Integer staffId;
    private OfficeLocation officeLocation;

    public LecturerT2(String name, Integer staffId, OfficeLocation officeLocation) throws ObjectCreatedException {
        super(name);
        setStaffId(staffId);
        this.officeLocation = officeLocation;
        System.out.println("lecturer constructor");
    }

    public LecturerT2(String name, Integer staffId) throws ObjectCreatedException {
        super(name);
        setStaffId(staffId);
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

    @Override
    public String toString() {
        return "Lecturer{" +
                "staffId=" + staffId +
                '}';
    }
}
