package vladproduction.com.examples.player_example.app02;

public class Businessman {
    private int income;
    private String name;

    public Businessman(int income, String name) {
        this.income = income;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Businessman{" +
                "income=" + income +
                ", name='" + name + '\'' +
                '}';
    }
}
