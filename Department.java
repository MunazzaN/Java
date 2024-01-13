// Department.java
public abstract class Department {
    abstract int getDepartmentSize();

    public static void main(String[] args) {
        SubDepartment sub1 = new SubDepartment();
        System.out.println("The Department Size is " + sub1.getDepartmentSize());
    }
}


