/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadorozhko.exam_var3.manipulation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import zadorozhko.exam_var3.exporters.CSVExporter;
import zadorozhko.exam_var3.exporters.XLSXExporter;
import zadorozhko.exam_var3.importers.CSVImporter;
import zadorozhko.exam_var3.importers.XLSXImporter;

/**
 *
 * @author Dasha
 */
public class DataManipulation {
    ArrayList<Energy> energies = new ArrayList<>();
    ArrayList<Nuclide> nuclides = new ArrayList<>();
    XLSXImporter xlsxI = new XLSXImporter();
    CSVImporter csvI = new CSVImporter();
    XLSXExporter xlsxE = new XLSXExporter();
    CSVExporter csvE = new CSVExporter();
    
    public int getLastRowNumber (String path, int sheetNumber) throws IOException, InvalidFormatException {
        return xlsxI.getLastRow(path, sheetNumber);
    }
    
    public int getLastColNumber (String path, int sheetNumber) throws IOException, InvalidFormatException {
        return xlsxI.getLastCol(path, sheetNumber);
    }
    
    public void importData(String path, int listNumber, int rowNumber, ArrayList<Integer> columnNumber) throws IOException, InvalidFormatException{
        
        if(path.endsWith("Energy.xlsx")){
            Energy energy = new Energy();
            if(columnNumber.get(0)!=null){
                energy.setDate(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(0)));
            }
            if(columnNumber.get(1)!=null){
                energy.setIndex(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(1)));
            }
            if(columnNumber.get(2)!=null){
                energy.setBuy(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(2)));
            }
            if(columnNumber.get(3)!=null){
                energy.setSale(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(3)));
            }
            if(columnNumber.get(4)!=null){
                energy.setTg(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(4)));
            }
            if(columnNumber.get(5)!=null){
                energy.setNPP(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(5)));
            }
            if(columnNumber.get(6)!=null){
                energy.setHPS(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(6)));
            }
            if(columnNumber.get(7)!=null){
                energy.setTPP(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(7)));
            }
            if(columnNumber.get(8)!=null){
                energy.setTemperature(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(8)));
            }
            if(columnNumber.get(9)!=null){
                energy.setPlanG(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(9)));
            }
            if(columnNumber.get(10)!=null){
                energy.setPlanP(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(10)));
            }
            if(columnNumber.get(11)!=null){
                energy.setFactG(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(11)));
            }
            if(columnNumber.get(12)!=null){
                energy.setFactP(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(12)));
            }
            if(columnNumber.get(13)!=null){
                energy.setConsumption(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(13)));
            }
        energies.add(energy);
        
        for(int i = 0; i < energies.size(); i++){
            System.out.println(energies.get(i).getIndex());
        }
        
        }
        if(path.endsWith("Nuclide.xlsx")){
            Nuclide nuclide = new Nuclide();
            if(columnNumber.get(0)!=null){
                nuclide.setName(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(0)));
            }
            if(columnNumber.get(1)!=null){
                nuclide.setE(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(1)));
            }
            if(columnNumber.get(2)!=null){
                nuclide.setDeltaE(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(2)));
            }
            if(columnNumber.get(3)!=null){
                nuclide.setDeltaEPercent(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(3)));
            }
            if(columnNumber.get(4)!=null){
                nuclide.setPShPV(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(4)));
            }
            if(columnNumber.get(5)!=null){
                nuclide.setS(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(5)));
            }
            if(columnNumber.get(6)!=null){
                nuclide.setDeltaS(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(6)));
            }
            if(columnNumber.get(7)!=null){
                nuclide.setDeltaSPercent(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(7)));
            }
            if(columnNumber.get(8)!=null){
                nuclide.setSFull(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(8)));
            }
            if(columnNumber.get(9)!=null){
                nuclide.setEps(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(9)));
            }
            if(columnNumber.get(10)!=null){
                nuclide.setDeltaEps(xlsxI.getValue(path, listNumber, rowNumber, columnNumber.get(10)));
            }
            nuclides.add(nuclide);
            
            for(int i = 0; i < nuclides.size(); i++){
                System.out.println(nuclides.get(i).getName());
            }
            
        }
        
        if(path.endsWith("Energy.csv")){
            Energy energy = new Energy();
            if(columnNumber.get(0)!=null){
                energy.setDate(csvI.getValue(path, rowNumber, columnNumber.get(0)));
            }
            if(columnNumber.get(1)!=null){
                energy.setIndex(csvI.getValue(path, rowNumber, columnNumber.get(1)));
            }
            if(columnNumber.get(2)!=null){
                energy.setBuy(csvI.getValue(path, rowNumber, columnNumber.get(2)));
            }
            if(columnNumber.get(3)!=null){
                energy.setSale(csvI.getValue(path, rowNumber, columnNumber.get(3)));
            }
            if(columnNumber.get(4)!=null){
                energy.setTg(csvI.getValue(path, rowNumber, columnNumber.get(4)));
            }
            if(columnNumber.get(5)!=null){
                energy.setNPP(csvI.getValue(path, rowNumber, columnNumber.get(5)));
            }
            if(columnNumber.get(6)!=null){
                energy.setHPS(csvI.getValue(path, rowNumber, columnNumber.get(6)));
            }
            if(columnNumber.get(7)!=null){
                energy.setTPP(csvI.getValue(path, rowNumber, columnNumber.get(7)));
            }
            if(columnNumber.get(8)!=null){
                energy.setTemperature(csvI.getValue(path, rowNumber, columnNumber.get(8)));
            }
            if(columnNumber.get(9)!=null){
                energy.setPlanG(csvI.getValue(path, rowNumber, columnNumber.get(9)));
            }
            if(columnNumber.get(10)!=null){
                energy.setPlanP(csvI.getValue(path, rowNumber, columnNumber.get(10)));
            }
            if(columnNumber.get(11)!=null){
                energy.setFactG(csvI.getValue(path, rowNumber, columnNumber.get(11)));
            }
            if(columnNumber.get(12)!=null){
                energy.setFactP(csvI.getValue(path, rowNumber, columnNumber.get(12)));
            }
            if(columnNumber.get(13)!=null){
                energy.setConsumption(csvI.getValue(path, rowNumber, columnNumber.get(13)));
            }
        energies.add(energy);
        
        for(int i = 0; i < energies.size(); i++){
            System.out.println(energies.get(i).getIndex());
        }
        
        }
        if(path.endsWith("Nuclide.csv")){
            Nuclide nuclide = new Nuclide();
            if(columnNumber.get(0)!=null){
                nuclide.setName(csvI.getValue(path, rowNumber, columnNumber.get(0)));
            }
            if(columnNumber.get(1)!=null){
                nuclide.setE(csvI.getValue(path, rowNumber, columnNumber.get(1)));
            }
            if(columnNumber.get(2)!=null){
                nuclide.setDeltaE(csvI.getValue(path, rowNumber, columnNumber.get(2)));
            }
            if(columnNumber.get(3)!=null){
                nuclide.setDeltaEPercent(csvI.getValue(path, rowNumber, columnNumber.get(3)));
            }
            if(columnNumber.get(4)!=null){
                nuclide.setPShPV(csvI.getValue(path, rowNumber, columnNumber.get(4)));
            }
            if(columnNumber.get(5)!=null){
                nuclide.setS(csvI.getValue(path, rowNumber, columnNumber.get(5)));
            }
            if(columnNumber.get(6)!=null){
                nuclide.setDeltaS(csvI.getValue(path, rowNumber, columnNumber.get(6)));
            }
            if(columnNumber.get(7)!=null){
                nuclide.setDeltaSPercent(csvI.getValue(path, rowNumber, columnNumber.get(7)));
            }
            if(columnNumber.get(8)!=null){
                nuclide.setSFull(csvI.getValue(path, rowNumber, columnNumber.get(8)));
            }
            if(columnNumber.get(9)!=null){
                nuclide.setEps(csvI.getValue(path, rowNumber, columnNumber.get(9)));
            }
            if(columnNumber.get(10)!=null){
                nuclide.setDeltaEps(csvI.getValue(path, rowNumber, columnNumber.get(10)));
            }
            nuclides.add(nuclide);
            
            for(int i = 0; i < nuclides.size(); i++){
                System.out.println(nuclides.get(i).getName());
            }
            
        }
        
    }
    
    public void exportData(String path, ArrayList<String> names, ArrayList<Integer> colNumber, boolean object, ArrayList<Integer> rowNumber) throws IOException {
        
        if(path.endsWith(".xlsx")){
            if(object){
                if(names == null){
                    String[][] array = new String[rowNumber.size()][colNumber.size()];
                    for(int i = 0; i < rowNumber.size(); i++){
                        array[i][0] = energies.get(rowNumber.get(i)).getDate();
                        array[i][1] = energies.get(rowNumber.get(i)).getIndex();
                        array[i][2] = energies.get(rowNumber.get(i)).getBuy();
                        array[i][3] = energies.get(rowNumber.get(i)).getSale();
                        array[i][4] = energies.get(rowNumber.get(i)).getTg();
                        array[i][5] = energies.get(rowNumber.get(i)).getNPP();
                        array[i][6] = energies.get(rowNumber.get(i)).getHPS();
                        array[i][7] = energies.get(rowNumber.get(i)).getTPP();
                        array[i][8] = energies.get(rowNumber.get(i)).getTemperature();
                        array[i][9] = energies.get(rowNumber.get(i)).getPlanG();
                        array[i][10] = energies.get(rowNumber.get(i)).getPlanP();
                        array[i][11] = energies.get(rowNumber.get(i)).getFactG();
                        array[i][12] = energies.get(rowNumber.get(i)).getFactP();
                        array[i][13] = energies.get(rowNumber.get(i)).getConsumption();
                    }
                    xlsxE.writeValue(array, colNumber);
                }else{
                    String[][] array = new String[rowNumber.size() + 1][colNumber.size()];
                    for(int i = 0; i < colNumber.size(); i++){
                        array[0][i] = names.get(i);
                    }
                    for(int i = 1; i <= rowNumber.size(); i++){
                        array[i][0] = energies.get(rowNumber.get(i)).getDate();
                        array[i][1] = energies.get(rowNumber.get(i)).getIndex();
                        array[i][2] = energies.get(rowNumber.get(i)).getBuy();
                        array[i][3] = energies.get(rowNumber.get(i)).getSale();
                        array[i][4] = energies.get(rowNumber.get(i)).getTg();
                        array[i][5] = energies.get(rowNumber.get(i)).getNPP();
                        array[i][6] = energies.get(rowNumber.get(i)).getHPS();
                        array[i][7] = energies.get(rowNumber.get(i)).getTPP();
                        array[i][8] = energies.get(rowNumber.get(i)).getTemperature();
                        array[i][9] = energies.get(rowNumber.get(i)).getPlanG();
                        array[i][10] = energies.get(rowNumber.get(i)).getPlanP();
                        array[i][11] = energies.get(rowNumber.get(i)).getFactG();
                        array[i][12] = energies.get(rowNumber.get(i)).getFactP();
                        array[i][13] = energies.get(rowNumber.get(i)).getConsumption();
                    }
                    xlsxE.writeValue(array, colNumber);
                }
            }else{
                if(names == null){
                    String[][] array = new String[rowNumber.size()][colNumber.size()];
                    for(int i = 0; i < rowNumber.size(); i++){
                        array[i][0] = nuclides.get(rowNumber.get(i)).getName();
                        array[i][1] = nuclides.get(rowNumber.get(i)).getE();
                        array[i][2] = nuclides.get(rowNumber.get(i)).getDeltaE();
                        array[i][3] = nuclides.get(rowNumber.get(i)).getDeltaEPercent();
                        array[i][4] = nuclides.get(rowNumber.get(i)).getPShPV();
                        array[i][5] = nuclides.get(rowNumber.get(i)).getS();
                        array[i][6] = nuclides.get(rowNumber.get(i)).getDeltaS();
                        array[i][7] = nuclides.get(rowNumber.get(i)).getDeltaSPercent();
                        array[i][8] = nuclides.get(rowNumber.get(i)).getSFull();
                        array[i][9] = nuclides.get(rowNumber.get(i)).getEps();
                        array[i][10] = nuclides.get(rowNumber.get(i)).getDeltaEps();
                    }
                    xlsxE.writeValue(array, colNumber);
                }else{
                    String[][] array = new String[rowNumber.size() + 1][colNumber.size()];
                    for(int i = 0; i < colNumber.size(); i++){
                        array[0][i] = names.get(i);
                    }
                    for(int i = 1; i <= rowNumber.size(); i++){
                        array[i][0] = nuclides.get(rowNumber.get(i)).getName();
                        array[i][1] = nuclides.get(rowNumber.get(i)).getE();
                        array[i][2] = nuclides.get(rowNumber.get(i)).getDeltaE();
                        array[i][3] = nuclides.get(rowNumber.get(i)).getDeltaEPercent();
                        array[i][4] = nuclides.get(rowNumber.get(i)).getPShPV();
                        array[i][5] = nuclides.get(rowNumber.get(i)).getS();
                        array[i][6] = nuclides.get(rowNumber.get(i)).getDeltaS();
                        array[i][7] = nuclides.get(rowNumber.get(i)).getDeltaSPercent();
                        array[i][8] = nuclides.get(rowNumber.get(i)).getSFull();
                        array[i][9] = nuclides.get(rowNumber.get(i)).getEps();
                        array[i][10] = nuclides.get(rowNumber.get(i)).getDeltaEps();
                    }
                    xlsxE.writeValue(array, colNumber);
                }
                
            }
        }
        
        if(path.endsWith(".csv")){
            
        }
    }
    
    public void create(String path) throws FileNotFoundException {
        xlsxE.create(path);
    }
    
    public void close() throws IOException {
        xlsxE.close();
    }
    
}
