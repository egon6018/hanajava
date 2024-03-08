package company;

public class Employee {
    private int id;
    private String idc;
    private String name;
    private long salary;

    public Employee(){

    }

    public Employee(int id, String idc, String name, long salary) {
        this.id = id;
        this.idc = idc;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getIdc() {
        return idc;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public  long getAnnSalary(){
        return salary * 12;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", idc='").append(idc).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
