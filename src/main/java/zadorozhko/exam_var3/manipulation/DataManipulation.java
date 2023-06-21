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
    private ArrayList<Energy> energies = new ArrayList<>();

    public ArrayList<Energy> getEnergies() {
        return energies;
    }

    public ArrayList<Nuclide> getNuclides() {
        return nuclides;
    }
    private ArrayList<Nuclide> nuclides = new ArrayList<>();
    private XLSXImporter xlsxI = new XLSXImporter();
    private CSVImporter csvI = new CSVImporter();
    private XLSXExporter xlsxE = new XLSXExporter();
    private CSVExporter csvE = new CSVExporter();
    
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
    
    public void exportData(String path, ArrayList<String> names, ArrayList<Integer> colNumber, boolean object,
            ArrayList<Integer> rowNumber, int leftUpCol, int leftUpRow) throws IOException {
        
        int length = 0;
        for(int i = 0; i < colNumber.size(); i++){
            if(colNumber.get(i) != null){
                length++;
            }
        }
        int height = rowNumber.size();
        if(object){
            
            if(rowNumber.size()>energies.size()){
                height = energies.size();
            }
            
            if(names == null){
                String[][] array = new String[height][length];
                for(int i = 0; i < height; i++){
                    int flag = 0;
                    if(colNumber.get(0) != null){
                        array[i][flag] = energies.get(rowNumber.get(i)).getDate();
                        flag++;
                    }
                    if(colNumber.get(1) != null){
                        array[i][1] = energies.get(rowNumber.get(i)).getIndex();
                        flag++;
                    }
                    if(colNumber.get(2) != null){
                        array[i][2] = energies.get(rowNumber.get(i)).getBuy();
                        flag++;
                    }
                    if(colNumber.get(3) != null){
                        array[i][3] = energies.get(rowNumber.get(i)).getSale();
                        flag++;
                    }
                    if(colNumber.get(4) != null){
                        array[i][4] = energies.get(rowNumber.get(i)).getTg();
                        flag++;
                    }
                    if(colNumber.get(5) != null){
                        array[i][5] = energies.get(rowNumber.get(i)).getNPP();
                        flag++;
                    }
                    if(colNumber.get(6) != null){
                        array[i][6] = energies.get(rowNumber.get(i)).getHPS();
                        flag++;
                    }
                    if(colNumber.get(7) != null){
                        array[i][7] = energies.get(rowNumber.get(i)).getTPP();
                        flag++;
                    }
                    if(colNumber.get(8) != null){
                        array[i][8] = energies.get(rowNumber.get(i)).getTemperature();
                        flag++;
                    }
                    if(colNumber.get(9) != null){
                        array[i][9] = energies.get(rowNumber.get(i)).getPlanG();
                        flag++;
                    }
                    if(colNumber.get(10) != null){
                        array[i][10] = energies.get(rowNumber.get(i)).getPlanP();
                        flag++;
                    }
                    if(colNumber.get(11) != null){
                        array[i][11] = energies.get(rowNumber.get(i)).getFactG();
                        flag++;
                    }
                    if(colNumber.get(12) != null){
                        array[i][12] = energies.get(rowNumber.get(i)).getFactP();
                        flag++;
                    }
                    if(colNumber.get(13) != null){
                        array[i][13] = energies.get(rowNumber.get(i)).getConsumption();
                    }
                }
                if(path.endsWith(".xlsx")){
                    xlsxE.writeValue(path, array, leftUpCol, leftUpRow);
                } else {
                    
                }
            }else{
                String[][] array = new String[height+1][length];
                for(int i = 0; i < length; i++){
                    array[0][i] = names.get(i);
                }
                for(int i = 1; i <= height; i++){
                    int flag = 0;
                    if(colNumber.get(0) != null){
                        array[i][flag] = energies.get(rowNumber.get(i-1)).getDate();
                        flag++;
                    }
                    if(colNumber.get(1) != null){
                        array[i][1] = energies.get(rowNumber.get(i-1)).getIndex();
                        flag++;
                    }
                    if(colNumber.get(2) != null){
                        array[i][2] = energies.get(rowNumber.get(i-1)).getBuy();
                        flag++;
                    }
                    if(colNumber.get(3) != null){
                        array[i][3] = energies.get(rowNumber.get(i-1)).getSale();
                        flag++;
                    }
                    if(colNumber.get(4) != null){
                        array[i][4] = energies.get(rowNumber.get(i-1)).getTg();
                        flag++;
                    }
                    if(colNumber.get(5) != null){
                        array[i][5] = energies.get(rowNumber.get(i-1)).getNPP();
                        flag++;
                    }
                    if(colNumber.get(6) != null){
                        array[i][6] = energies.get(rowNumber.get(i-1)).getHPS();
                        flag++;
                    }
                    if(colNumber.get(7) != null){
                        array[i][7] = energies.get(rowNumber.get(i-1)).getTPP();
                        flag++;
                    }
                    if(colNumber.get(8) != null){
                        array[i][8] = energies.get(rowNumber.get(i-1)).getTemperature();
                        flag++;
                    }
                    if(colNumber.get(9) != null){
                        array[i][9] = energies.get(rowNumber.get(i-1)).getPlanG();
                        flag++;
                    }
                    if(colNumber.get(10) != null){
                        array[i][10] = energies.get(rowNumber.get(i-1)).getPlanP();
                        flag++;
                    }
                    if(colNumber.get(11) != null){
                        array[i][11] = energies.get(rowNumber.get(i-1)).getFactG();
                        flag++;
                    }
                    if(colNumber.get(12) != null){
                        array[i][12] = energies.get(rowNumber.get(i-1)).getFactP();
                        flag++;
                    }
                    if(colNumber.get(13) != null){
                        array[i][13] = energies.get(rowNumber.get(i-1)).getConsumption();
                    }
                }
                if(path.endsWith(".xlsx")){
                    xlsxE.writeValue(path, array, leftUpCol, leftUpRow);
                } else {
                    
                }
            }
        }else{
            if(rowNumber.size()>nuclides.size()){
                height = nuclides.size();
            }
            
            if(names == null){
                String[][] array = new String[height][length];
                for(int i = 0; i < height; i++){
                    int flag = 0;
                    if(colNumber.get(0) != null){
                        array[i][0] = nuclides.get(rowNumber.get(i)).getName();
                        flag++;
                    }
                    if(colNumber.get(1) != null){
                        array[i][1] = nuclides.get(rowNumber.get(i)).getE();
                        flag++;
                    }
                    if(colNumber.get(2) != null){
                        array[i][2] = nuclides.get(rowNumber.get(i)).getDeltaE();
                        flag++;
                    }
                    if(colNumber.get(3) != null){
                        array[i][3] = nuclides.get(rowNumber.get(i)).getDeltaEPercent();
                        flag++;
                    }
                    if(colNumber.get(4) != null){
                        array[i][4] = nuclides.get(rowNumber.get(i)).getPShPV();
                        flag++;
                    }
                    if(colNumber.get(5) != null){
                        array[i][5] = nuclides.get(rowNumber.get(i)).getS();
                        flag++;
                    }
                    if(colNumber.get(6) != null){
                        array[i][6] = nuclides.get(rowNumber.get(i)).getDeltaS();
                        flag++;
                    }
                    if(colNumber.get(7) != null){
                        array[i][7] = nuclides.get(rowNumber.get(i)).getDeltaSPercent();
                        flag++;
                    }
                    if(colNumber.get(8) != null){
                        array[i][8] = nuclides.get(rowNumber.get(i)).getSFull();
                        flag++;
                    }
                    if(colNumber.get(9) != null){
                        array[i][9] = nuclides.get(rowNumber.get(i)).getEps();
                        flag++;
                    }
                    if(colNumber.get(10) != null){
                        array[i][10] = nuclides.get(rowNumber.get(i)).getDeltaEps();
                    }
                }
                if(path.endsWith(".xlsx")){
                    xlsxE.writeValue(path, array, leftUpCol, leftUpRow);
                } else {
                    
                }
            }else{
                String[][] array = new String[height+1][length];
                for(int i = 0; i < length; i++){
                    array[0][i] = names.get(i);
                }
                for(int i = 1; i <= height; i++){
                    int flag = 0;
                    if(colNumber.get(0) != null){
                        array[i][0] = nuclides.get(rowNumber.get(i-1)).getName();
                        flag++;
                    }
                    if(colNumber.get(1) != null){
                        array[i][1] = nuclides.get(rowNumber.get(i-1)).getE();
                        flag++;
                    }
                    if(colNumber.get(2) != null){
                        array[i][2] = nuclides.get(rowNumber.get(i-1)).getDeltaE();
                        flag++;
                    }
                    if(colNumber.get(3) != null){
                        array[i][3] = nuclides.get(rowNumber.get(i-1)).getDeltaEPercent();
                        flag++;
                    }
                    if(colNumber.get(4) != null){
                        array[i][4] = nuclides.get(rowNumber.get(i-1)).getPShPV();
                        flag++;
                    }
                    if(colNumber.get(5) != null){
                        array[i][5] = nuclides.get(rowNumber.get(i-1)).getS();
                        flag++;
                    }
                    if(colNumber.get(6) != null){
                        array[i][6] = nuclides.get(rowNumber.get(i-1)).getDeltaS();
                        flag++;
                    }
                    if(colNumber.get(7) != null){
                        array[i][7] = nuclides.get(rowNumber.get(i-1)).getDeltaSPercent();
                        flag++;
                    }
                    if(colNumber.get(8) != null){
                        array[i][8] = nuclides.get(rowNumber.get(i-1)).getSFull();
                        flag++;
                    }
                    if(colNumber.get(9) != null){
                        array[i][9] = nuclides.get(rowNumber.get(i-1)).getEps();
                        flag++;
                    }
                    if(colNumber.get(10) != null){
                        array[i][10] = nuclides.get(rowNumber.get(i-1)).getDeltaEps();
                    }
                }
                if(path.endsWith(".xlsx")){
                    xlsxE.writeValue(path, array, leftUpCol, leftUpRow);
                } else {
                    
                }
            }

        }
    }
    
    
}
