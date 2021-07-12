package immutableObject;

public class Stream implements Cloneable{
    private final String streamNumber;
    private int znoPoints;

    public Stream(String streamNumber, int znoPoints) {
        this.streamNumber = streamNumber;
        this.znoPoints = znoPoints;
    }

    public int getPoints() {
        return znoPoints;
    }

    public void incrementPoints(){
        znoPoints++;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof Stream){
            Stream s1 = (Stream) obj;
            if (this.hashCode() == s1.hashCode()) {
                return s1.znoPoints == this.znoPoints && s1.streamNumber.equals(this.streamNumber);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return streamNumber.hashCode() / znoPoints;
    }

    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Class isn`t implements interface Cloneable"); /// CHANGE THAT SHIT
        }
    }
}
