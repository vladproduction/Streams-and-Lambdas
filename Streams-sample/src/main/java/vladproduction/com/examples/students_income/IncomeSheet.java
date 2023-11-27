package vladproduction.com.examples.students_income;

public class IncomeSheet {

    private double income;
    private String name;

    public IncomeSheet(double income, String name) {
        this.income = income;
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return"name = " + name + ", income = " + income;


    }
}
