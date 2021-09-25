public class Work {
    private String name;
    private int salary;
    public Work(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary(int salary){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String toString(){
        return name + " Salary " + salary;
    }
}
