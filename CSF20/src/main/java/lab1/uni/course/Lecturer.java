package lab1.uni.course;

public class Lecturer extends Person {
    private Integer staffId;

    public Lecturer(String name, Integer staffId) throws ObjectCreatedException {
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
