public class ValidationResult {
    boolean checksumVerified;
    String issuerName;

    public ValidationResult(boolean checksumVerified, String issuerName) {
        this.checksumVerified = checksumVerified;
        this.issuerName = issuerName;
    }

    @Override
    public String toString() {
        return "ValidationResult{" +
                "checksumVerified=" + checksumVerified +
                ", issuerName='" + issuerName + '\'' +
                '}';
    }
}
