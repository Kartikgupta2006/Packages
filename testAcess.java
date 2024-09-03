package challenge3;

public class testAcess {
    public static void main(String[] args) {
        employee emo = new employee("kartik", 18, 25000);
        System.out.println(emo.EmployeeDetail());
        emo.setName("gupta jii");
        System.out.println(emo.EmployeeDetail());
    }
}
