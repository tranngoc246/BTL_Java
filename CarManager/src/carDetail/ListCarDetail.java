package carDetail;

import Helper.XFile;
import java.io.File;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ListCarDetail {

    ArrayList<CarDetail> list = new ArrayList<>();
    private String path = "listCarDetail.dat";

    public void add(CarDetail car) {
        list.add(car);
    }

    public CarDetail findById(String id) {
        for (CarDetail car : list) {
            if (car.getId().equals(id)) {
                return car;
            }
        }
        return null;
    }

    public void deleteById(String id) {
        for (CarDetail car : list) {
            if (car.getId().equals(id)) {
                list.remove(car);
            }
        }
    }

    public boolean replace(String id, CarDetail car) {
        int i=0;
        for (CarDetail cars : list) {
            if (cars.getId().equals(id)) {
                list.set(i, car);
                return true;
            }
            i++;
        }
        return false;
    }
    
    public void print(){
        for (CarDetail car : list) {
            System.out.println(car);
        }
    }

    public void loadFile() throws Exception {
        File file = new File(path);
        if (file.exists()) {
            list = (ArrayList<CarDetail>) XFile.readFile(path);
        }
    }

    public void writeToFile() throws Exception {
        XFile.writeFile(path, list);
    }

    public void renderToTable(DefaultTableModel table) {
        table.setRowCount(0);

        int i = 1;
        for (CarDetail car : list) {
            Object[] row = new Object[]{
                i, car.getId(), car.getName(), car.getBrand(), car.getYear(), car.getAmount(), car.getCost(), " "
            };
            table.addRow(row);
            i++;
        }
        table.fireTableStructureChanged();
    }
}
