import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

    private int cost;

    private boolean unit;

    public Product(){}
    public Product( int cost, boolean unitOrMass) {
        this.cost = cost;
        this.unit = unitOrMass;
    }

    public boolean getUnitOrMass() {
        return unit;
    }

    public void changeUnitOrMass() {
        this.unit = !this.unit;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
