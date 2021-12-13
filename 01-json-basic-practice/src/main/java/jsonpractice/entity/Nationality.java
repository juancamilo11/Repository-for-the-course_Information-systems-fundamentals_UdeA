package jsonpractice.entity;

public class Nationality {
    private String name;
    private String code;
    private String flagUrl;

    public Nationality() {
    }

    public Nationality(String name, String code, String flagUrl) {
        this.name = name;
        this.code = code;
        this.flagUrl = flagUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFlagUrl() {
        return flagUrl;
    }

    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
    }

    @Override
    public String toString() {
        return " {" +
                "name:'" + name + '\'' +
                ", code:'" + code + '\'' +
                ", flagUrl:'" + flagUrl + '\'' +
                '}';
    }
}
