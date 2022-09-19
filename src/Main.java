public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        
        double myBmi = service.calculate(80, 1.8); // Рост в метрах, вес в килограммах
        System.out.println(myBmi);
    }
}
