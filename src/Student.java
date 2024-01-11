public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // Move this line outside the main method
        Student myObject = new Student();
        myObject.setName("Munazza Niazi");
        System.out.println("Student's Name: " + myObject.getName());
    }
}
