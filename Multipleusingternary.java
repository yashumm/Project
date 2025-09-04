public class MultipleIfElseTernary {
    public static void main(String[] args) {
        int marks = 72;

        // Multiple if-else using ternary operator
        String grade = (marks >= 90) ? "Grade: A+"
                    : (marks >= 80) ? "Grade: A"
                    : (marks >= 70) ? "Grade: B"
                    : (marks >= 60) ? "Grade: C"
                    : (marks >= 50) ? "Grade: D"
                    : "Grade: Fail";

        System.out.println(grade);
    }
}
