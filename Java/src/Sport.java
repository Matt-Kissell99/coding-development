public class Sport {
    private String choice = "Badminton";

    private static void privateClass() {
        String choice2 = "Football";
    }

    public String getSportChoice() {
        return choice;
    }

    public void setSportChoice(String newChoice) {
        this.choice = newChoice;
    }
}
