package jsonpractice.entity;

public class PhoneNumber {
    private String prefix;
    private String number;

    public PhoneNumber() {
    }

    public PhoneNumber(String prefix, String number) {
        this.prefix = prefix;
        this.number = number;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return " {" +
                "prefix:'" + prefix + '\'' +
                ", number:'" + number + '\'' +
                '}';
    }
}
