public class CreditCardValidator implements Validator {

    @Override
    public ValidationResult validate(String number) {
        ChecksumVerifier checksumVerifier = new LuhnVerifier();
        boolean checksumVerified = checksumVerifier.verify(number);
        IssuerDetector issuerDetector = new IssuerDetector();
        String issuerName = issuerDetector.detect(number);
        ValidationResult validationResult = new ValidationResult(checksumVerified,issuerName);
        return validationResult;
    }
}
