public enum PlaneType {
    AIRBUSA380(525),
    AIRBUSA330(335),
    BOEING787DREAMLINER(335),
    BOEING777(396);


    private final int seatCapacity;

    PlaneType(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public int getSeatCapacity() {
        return this.seatCapacity;
    }
}
