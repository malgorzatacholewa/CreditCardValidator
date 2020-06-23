import java.util.List;

public class IssuerDetector {

    public String detect (String cardNo){
        List<IssuerRule> list = new IssuerRuleRepository().getAll();
        int length;
        for (IssuerRule issuerRule : list){
            length = (int) Double.parseDouble(issuerRule.getLength());
            String cardNoPrefix = cardNo.substring(0,length);
            if (Integer.parseInt(cardNoPrefix) == (int) Double.parseDouble(issuerRule.getPrefix())){
                return issuerRule.getName();
            }

        }
        return "Nie znaleziono";
    }
}
