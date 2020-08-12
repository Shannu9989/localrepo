class Department
{
    int deptNo;
    String dName;
    String location;
    Employee[] employees;
    public Department() {}
    public Department(int deptNo,String dName,String location,Employee[] employees)
    {
       this.deptNo=deptNo;  this.dName=dName;  this.location=location;  this.employees=employees;
    }
    public void showDepartmentDetails()
    {
         System.out.println("Department NUmber "+deptNo);
         System.out.println("Department Name   "+dName);
         System.out.println("Department Location "+location);
         System.out.println("Department Employees");
         for(Employee e : employees)
         {
            e.showEmployee(); 
            System.out.println();
         }
    }
}   
