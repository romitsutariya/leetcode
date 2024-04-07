public enum Direction {
    NORTH(0),NORTH_EAST(45),EAST(90),SOUTH_EAST(135),SOUTH(180),SOUTH_WEST(225),WEST(270),NORTH_WEST(360);

    private final int degrees;

    Direction(int degrees){
        this.degrees=degrees;
    }
    public Direction getnextDirection(){
       Direction[] allDirections=Direction.values();
       return allDirections[(this.ordinal()+1)%allDirections.length];
    }
    public int getDegrees(){
       return this.degrees;
    }
}
