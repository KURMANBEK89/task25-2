public class City implements Comparable<City>{
    private int code;
    private String name;
    private String capitalOf;

    public City(int code, String name, String capitalOf) {
        this.code = code;
        this.name = name;
        this.capitalOf = capitalOf;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapitalOf() {
        return capitalOf;
    }

    public void setCapitalOf(String capitalOf) {
        this.capitalOf = capitalOf;
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", capitalOf='" + capitalOf + '\'' +
                '}';
    }

    @Override
    public int compareTo(City o) {
        return o.getCode()-this.getCode();
    }
}
