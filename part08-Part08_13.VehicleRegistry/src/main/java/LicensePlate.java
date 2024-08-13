
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(this instanceof LicensePlate)) {
            return false;
        }

        LicensePlate comparedPlate = (LicensePlate) compared;

        if (this.liNumber.equals(comparedPlate.liNumber) 
        && this.country.equals(comparedPlate.country)) {
            return true;
        }

        return false;

    }

    public int hashCode() {
       return Objects.hash(country, liNumber);
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
