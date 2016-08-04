/**
 * Created by chris on 8/3/16.
 */
public class TableSaw {
    int bladeSize;
    int bladeSpeed;
    int fencePos;
    String bodyStyle;
    String manufacturer;
    String model;
    boolean useFence;
    boolean sawRunning = false;

    public TableSaw(int bladeSize, int bladeSpeed, int fencePos, String bodyStyle, String manufacturer,
                    String model, boolean useFence) {
        this.bladeSize = bladeSize;
        this.bladeSpeed = bladeSpeed;
        this.bodyStyle = bodyStyle;
        this.manufacturer = manufacturer;
        this.model = model;
        this.fencePos = fencePos;
        this.useFence = useFence;
    }

    public void powerSwitch() {
        sawRunning = !sawRunning;
        if (sawRunning) {
            System.out.println("Saw is on! Be careful!");
        } else {
            System.out.println("Saw is off.");
        }
    }

    public void setFence(int fencePos, boolean useFence) {
        this.useFence = useFence;
        if (this.useFence) {
            this.fencePos = fencePos;
        }
    }

    @Override
    public String toString() {
        return "A " + this.manufacturer + " " + this.model + " " + this.bodyStyle +
                " tablesaw with a " + this.bladeSize;
    }
}
