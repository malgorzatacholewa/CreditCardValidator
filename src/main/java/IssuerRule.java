public class IssuerRule {
    String name;
    String prefix;
    String length;

    public IssuerRule(String name, String prefix, String length) {
        this.name = name;
        this.prefix = prefix;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getLength() {
        return length;
    }
}
