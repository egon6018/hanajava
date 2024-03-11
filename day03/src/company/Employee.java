package company;

public class Employee {
    private int id;
    private String idc;
    private String name;
    private long salary;

    private static int num = 100;

    public Employee(){ // default constructor
        System.out.println("Default Constructor");
    }
    public Employee(int id){
        // 아래처럼 하면 에러 발생
//        this.salary = 100000L;
//        this(id,"","");


        // 반드시 생성자에서 첫번째줄에 this()를 넣어주어야 에러가 발생하지 X
        this(id,"","");
        this.salary = 100000L;
    }

    public Employee(int id, String idc, String name) { // 인턴은 salary가 따로 정해져있어서 굳이 인자로 주지 않아도 되니까
        this(id,idc,name,10000L); // 한번에 한줄로 입력 가능

//        this.id = id;
//        this.idc = idc;
//        this.name = name;
//        this.salary = 100000L;
    }
//    public Employee(String idc, String name, long salary){
//        this(idc,name,salary);
//    }
    public Employee(int id, String idc, String name, long salary) {
        this.id = num++;
        this.idc = idc;
        this.name = name;
        if(salary <= 0){
            // 예외 발생
        }
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
