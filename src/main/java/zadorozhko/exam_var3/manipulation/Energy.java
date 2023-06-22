/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadorozhko.exam_var3.manipulation;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dasha
 */
@XmlRootElement(name = "energy")
public class Energy {
    private String date = "";
    private String index = "";
    private String buy = "";
    private String sale = "";
    private String tg = "";
    private String NPP = "";
    private String HPS = "";
    private String TPP = "";
    private String temperature = "";
    private String planG = "";
    private String planP = "";
    private String factG = "";
    private String factP = "";
    private String consumption = "";

    
    @XmlElement(name = "date")
    public String getDate() {
        return date;
    }
    @XmlElement(name = "index")
    public String getIndex() {
        return index;
    }
    @XmlElement(name = "buy")
    public String getBuy() {
        return buy;
    }
    @XmlElement(name = "sale")
    public String getSale() {
        return sale;
    }
    @XmlElement(name = "tg")
    public String getTg() {
        return tg;
    }
    @XmlElement(name = "NPP")
    public String getNPP() {
        return NPP;
    }
    @XmlElement(name = "HPS")
    public String getHPS() {
        return HPS;
    }
    @XmlElement(name = "TPP")
    public String getTPP() {
        return TPP;
    }
    @XmlElement(name = "temperature")
    public String getTemperature() {
        return temperature;
    }
    @XmlElement(name = "planG")
    public String getPlanG() {
        return planG;
    }
    @XmlElement(name = "planP")
    public String getPlanP() {
        return planP;
    }
    @XmlElement(name = "factG")
    public String getFactG() {
        return factG;
    }
    @XmlElement(name = "factP")
    public String getFactP() {
        return factP;
    }
    @XmlElement(name = "consumption")
    public String getConsumption() {
        return consumption;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }

    public void setNPP(String NPP) {
        this.NPP = NPP;
    }

    public void setHPS(String HPS) {
        this.HPS = HPS;
    }

    public void setTPP(String TPP) {
        this.TPP = TPP;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setPlanG(String planG) {
        this.planG = planG;
    }

    public void setPlanP(String planP) {
        this.planP = planP;
    }

    public void setFactG(String factG) {
        this.factG = factG;
    }

    public void setFactP(String factP) {
        this.factP = factP;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }
    
}
