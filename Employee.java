public class Employee {
    String name;
    int id;
    int salary;

    Employee(String name, int id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }

    public static void main(String[] args){
        Employee obj=new Employee("Manvi",20,25000);
        obj.display();

    }
}
