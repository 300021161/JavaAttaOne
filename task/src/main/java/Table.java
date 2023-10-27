public class Table {

    private int collSeats;

    private boolean smoking;

    public Table(){}

    public Table(int collSeats, boolean smoking) {
        this.collSeats = collSeats;
        this.smoking = smoking;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public int getCollSeats() {
        return collSeats;
    }

    public void setCollSeats(int collSeats) {
        this.collSeats = collSeats;
    }
}