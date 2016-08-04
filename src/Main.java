/**
 * Created by chris on 8/3/16.
 */
public class Main {
    public static void main(String [] args) {
        TableSaw table_saw = new TableSaw(10, 3450, 10, "Hybrid", "Grizzly", "PS701", false);

        table_saw.setFence(12, true);
        table_saw.powerSwitch();

        System.out.println(table_saw.toString());

        TableSaw cabinet_saw = new TableSaw(12, 3450, 4, "Cabinet", "Delta", "DW875", true);

        cabinet_saw.setFence(0, false);
        cabinet_saw.powerSwitch();
        cabinet_saw.powerSwitch();

        System.out.println(table_saw.toString());
    }
}
