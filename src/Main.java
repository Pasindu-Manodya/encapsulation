public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Pasindu");
        s.setAge(23);
        s.setSchool("TCC");
        //s.number();
        //s.setNumber(55);

        System.out.println(s.getName() + " , " + s.getAge() + " , " + s.getSchool() + " , " + s.getNumber());
    }
}