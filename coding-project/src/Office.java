import java.util.ArrayList;
import java.util.List;

public class Office {
    private final Integer officeNumber;
    private String officeName;
    private final List<String> employees;

    public Office(String officeName) {
        this.officeNumber = UniqueIdentifier.generateUniqueIdentifier();
        this.officeName = officeName;
        this.employees = new ArrayList<>();
    }

    public Integer getOfficeNumber() {
        return officeNumber;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void addEmployee(String employeeName) {
        employees.add(employeeName);
    }

    public void removeEmployee(String employeeName) {
        employees.remove(employeeName);
    }

    public void getEmployees() {
        System.out.println("Employees in office " + officeName + ": " + employees);
    }
}
