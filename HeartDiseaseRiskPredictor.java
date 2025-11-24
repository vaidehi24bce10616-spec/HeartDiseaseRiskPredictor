
    import java.util.Scanner;

public class HeartDiseaseRiskPredictor {

    public static String predictRisk(int age, String gender, int bp, int cholesterol, boolean smoker, boolean diabetic) {
        int riskScore = 0;

        // Basic risk scoring rules
        if (age > 50) riskScore++;
        if (gender.equalsIgnoreCase("M")) riskScore++;
        if (bp > 140) riskScore++;
        if (cholesterol > 240) riskScore++;
        if (smoker) riskScore++;
        if (diabetic) riskScore++;

        // Risk classification
        if (riskScore >= 3) {
            return "High Risk of Heart Disease";
        } else {
            return "Low Risk of Heart Disease";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Heart Disease Risk Predictor");
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Gender (M/F): ");
        String gender = scanner.next();

        System.out.print("Enter Blood Pressure (mm Hg): ");
        int bp = scanner.nextInt();

        System.out.print("Enter Cholesterol Level (mg/dL): ");
        int cholesterol = scanner.nextInt();

        System.out.print("Are you a smoker? (true/false): ");
        boolean smoker = scanner.nextBoolean();

        System.out.print("Do you have diabetes? (true/false): ");
        boolean diabetic = scanner.nextBoolean();

        String result = predictRisk(age, gender, bp, cholesterol, smoker, diabetic);
        System.out.println("Prediction Result: " + result);

        scanner.close();
    }
}

    

