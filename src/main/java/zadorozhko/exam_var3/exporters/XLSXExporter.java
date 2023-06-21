/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadorozhko.exam_var3.exporters;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Dasha
 */
public class XLSXExporter extends Exporter{
    
    private XSSFWorkbook workbook;
    private FileOutputStream fileOutput;
    private Sheet sheet;
    
    public void create(String path) throws FileNotFoundException {
        workbook = new XSSFWorkbook();
        fileOutput = new FileOutputStream(path);
        sheet = workbook.createSheet("Sheet");
    }
    
    public void writeValue(String[][] array, ArrayList<Integer> colNumber) throws FileNotFoundException, IOException {
        
        Row row;
        Cell cell;
        for(int i = 0; i < array.length; i++){
            row = sheet.createRow(i);
            for(int j = 0; j < array[i].length; j++){
                cell = row.createCell(colNumber.get(j));
                cell.setCellValue(array[i][j]);
            }
        }
        workbook.write(fileOutput);
    }
    
    public void close() throws IOException {
        workbook.close();
    }
}
