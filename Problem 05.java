public class Student {
    private String name;
    private int exam1;
    private int exam2;
    private int exam3;

    public Student(String name, int exam1, int exam2, int exam3) {
        if (!isValidScore(exam1) || !isValidScore(exam2) || !isValidScore(exam3)) {
            throw new IllegalArgumentException("Exam scores must be between 0 and 100.");
        }

        this.name = name;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.exam3 = exam3;
    }

    private boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }

    public String getName() {
        return name;
    }

    public double calculateAverage() {
        return (exam1 + exam2 + exam3) / 3.0;
    }
}
