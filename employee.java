package challenge3;

 class employee {
     private String name;
     private int age;
     private double salary;

      employee(String name, int age, double salary) {
         this.name = name;
         this.age = age;
         this.salary = salary;
     }

     String EmployeeDetail(){
          return "Employee : name "+ name+
                  ", Age: "+ age+
                  ", salary  " +salary;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }
 }
