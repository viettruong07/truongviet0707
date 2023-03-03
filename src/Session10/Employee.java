package Session10;

class Employee {
    String empId;
    String empName;
    int salary;
    float commission;

    public Employee(String id, String name, int sal) {
        empId = id;
        empName = name;
        salary = sal;
    }
    public void calcCommission(float sales){
        if (sales > 10000)
            commission = salary * 20 / 100;
        else
            commission = 0;
    }
    public void displayDetails(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Commission: " + commission);
    }
}
