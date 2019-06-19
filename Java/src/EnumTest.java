public enum EnumTest {
    HIGH ("High"),
    MEDIUM ("Medium"),
    LOW ("Low"),
    ;

    public String enumType;

    EnumTest(String stringEnums) {
        this.enumType = stringEnums;
    }

    public String getEnumType() {
        return enumType;
    }
}
