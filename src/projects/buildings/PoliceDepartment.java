package projects.buildings;

public class PoliceDepartment extends Building {
    private int employeesCount = 0;

    public int getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
    }

    @Override
    public String toString() {
        return "This is a PoliceDepartment";
    }
}
