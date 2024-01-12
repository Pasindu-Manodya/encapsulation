public class Student {
    private String name = "ABC";
    private int age;
    private String school;
    private int number = 23;

    public void setName(String studentName){
        name = studentName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int studentAge){
        age = studentAge;
    }
    public int getAge(){
        return age;
    }
    public void setSchool(String studentSchool){
        school = studentSchool;
    }
    public String getSchool(){
        return school;
    }
    public void setNumber(int newNumber){
        number = newNumber;
    }
    public int getNumber(){
        return number;
    }
    public void hi(){
        System.out.println("hello");
    }
}
