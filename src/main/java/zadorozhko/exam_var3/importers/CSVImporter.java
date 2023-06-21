/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadorozhko.exam_var3.importers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Dasha
 */
public class CSVImporter extends Importer {
    private BufferedReader bufferReader;
    private FileReader fileReader;
    
    public String getValue(String path, int rowNumber, int cellNumber) throws FileNotFoundException, IOException {
        fileReader = new FileReader(path);
        bufferReader = new BufferedReader(fileReader);
        String value = null;
        String row;
        String[] col = null;
        for (int i = 0; i <= rowNumber; i++) {
            row = bufferReader.readLine();
            if(row == null){
                bufferReader.close();
                return null;
            }
            col = row.split(",");
            value = col[cellNumber];
        }
        bufferReader.close();
        return value;
    }
}
