/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadorozhko.exam_var3.importers;

import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Dasha
 */
public class XLSXImporter extends Importer {

    private File file;
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    
    public String getValue(String path, int sheetNumber, int rowNumber, int cellNumber) throws IOException, InvalidFormatException {
        String value = "";
        Open(path);
        if(sheetNumber>workbook.getNumberOfSheets()-1){
            sheetNumber = workbook.getNumberOfSheets()-1;
        }
        sheet = workbook.getSheetAt(sheetNumber);
        Row row = sheet.getRow(rowNumber);
        if(row != null){
            Cell cell = row.getCell(cellNumber);
            value = cell.toString();
            workbook.close();
            return value;
        } else{
            workbook.close();
            return value;
        }
    }
    
    public int getLastRow (String path, int sheetNumber) throws IOException, InvalidFormatException{
        Open(path);
        sheet = workbook.getSheetAt(sheetNumber);
        workbook.close();
        return sheet.getLastRowNum();
    }
    
    public int getLastCol (String path, int sheetNumber) throws IOException, InvalidFormatException{
        Open(path);
        sheet = workbook.getSheetAt(sheetNumber);
        int lastCol = 0;
        for (Row row : sheet) {
            int currentLastCol = row.getLastCellNum();
            if (currentLastCol > lastCol) {
                lastCol = currentLastCol;
            }
        }
        workbook.close();
        return lastCol;
    }
    
    public void Open(String path) throws IOException, InvalidFormatException {
        file = new File(path);
        workbook = new XSSFWorkbook(file);
    }
    
}
