import java.util.Scanner;

class Faculty
{
  public int salary;
  public Faculty(int salary)
  {
    System.out.println("Base Salary: " +salary);
  }
 
}
class CSE
{
 public int salary;
 
  
  public void setSalary(int salary)
  {
    this.salary = salary;
  }
  public int getSalary()
  {
    return salary;
  }
  
  public void salary(int salary)
  {
    
     int sal1 = salary + 3000;
     System.out.println("CSE Faculty: " + sal1);
     
  }
}
class IT
{
  public void salary(int salary)
  {
    int sal2  = salary + 5000;
     System.out.println("IT Faculty: " + sal2);
  }
}
class ECE
{
  public void salary(int salary)
  {
    int sal3 = salary + 4500;
     System.out.println("ECE Faculty: " + sal3);
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int salary = sc.nextInt();
    Faculty fac = new Faculty(salary);
    ECE obj = new ECE();
    CSE cs = new CSE();
    IT it = new IT();
    cs.salary(salary);
    it.salary(salary);
    obj.salary(salary);
    //implement your required concept here
  }
}