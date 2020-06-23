import java.util.List;

public class App {
    public static void main(String[] args) {
        String numberOfCard = "4874742065645931";
        String numberOfCard2 = "4485233903945601";

        CreditCardValidator creditCardValidator = new CreditCardValidator();
        ValidationResult validationResult = creditCardValidator.validate(numberOfCard);
        System.out.println(validationResult);

    }
}
