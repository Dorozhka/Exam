/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadorozhko.exam_var3.exporters;

import com.opencsv.CSVWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Dasha
 */
public class CSVExporter extends Exporter {
    public void writeValue(String path, String[][] array) throws FileNotFoundException, IOException {
        ArrayList<String[]> rows = new ArrayList<>();
        FileWriter filewriter = new FileWriter(path);
        CSVWriter writer = new CSVWriter(filewriter);
        for(int i = 0; i<array.length; i++) {
            rows.add(array[i]);
        }
        writer.writeAll(rows);
        writer.close();
    }
}
