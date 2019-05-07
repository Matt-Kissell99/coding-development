public class Manufacturer {

    private String[] OEMS;

    public Manufacturer() {
        OEMS = new String [] {"Item1","Item2","Item3"};
    }

    public String getItemFromArray(int index) {
        return OEMS[index];
    }

    public String changeValue(int index, String newValue) {
        return OEMS[index] = newValue;
    }

    public int getLength() {
        return OEMS.length;
    }

}
