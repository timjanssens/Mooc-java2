
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author timja
 */
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }

        double largest = this.history.get(0);
        for (double change : history) {
            if (change > largest) {
                largest = change;
            }
        }
        return largest;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }

        double smallest = this.history.get(0);
        for (double change : history) {
            if (change < smallest) {
                smallest = change;
            }
        }
        return smallest;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (double change : history) {
            sum += change;
        }
        return sum / this.history.size();
    }

    @Override
    public String toString() {
        return history.toString();
    }

}
