import java.util.List;

public class IssuerRuleRepository {

    public List<IssuerRule> getAll() {
        FileReader fileReader = new FileReader();
        return fileReader.readData("data.xlsx");
    }
}
