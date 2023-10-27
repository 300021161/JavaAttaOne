public class Waiter {
    private int collOrder;
    private double rating;

    public double getRating() {
        return rating;
    }

    public int getCollOrder(){
        return collOrder;
    }

    public void addRating(double rating) {
        collOrder++;
        this.rating = (this.rating * (collOrder - 1) + rating) / collOrder;
    }

    public Waiter(int collOrder, double rating) {
        this.collOrder = collOrder;
        this.rating = rating;
    }

    public Waiter(){}
}