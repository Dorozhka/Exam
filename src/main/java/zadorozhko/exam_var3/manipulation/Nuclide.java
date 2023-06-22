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
@XmlRootElement(name = "nuclide")
public class Nuclide {
    private String name = "";
    private String E = "";
    private String deltaE = "";
    private String deltaEPercent = "";
    private String PShPV = "";
    private String S = "";
    private String deltaS = "";
    private String deltaSPercent = "";
    private String SFull = "";
    private String eps = "";
    private String deltaEps = "";

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }
    @XmlElement(name = "E")
    public String getE() {
        return E;
    }
    @XmlElement(name = "deltaE")
    public String getDeltaE() {
        return deltaE;
    }
    @XmlElement(name = "deltaEPercent")
    public String getDeltaEPercent() {
        return deltaEPercent;
    }
    @XmlElement(name = "PShPV")
    public String getPShPV() {
        return PShPV;
    }
    @XmlElement(name = "S")
    public String getS() {
        return S;
    }
    @XmlElement(name = "deltaS")
    public String getDeltaS() {
        return deltaS;
    }
    @XmlElement(name = "deltaSPercent")
    public String getDeltaSPercent() {
        return deltaSPercent;
    }
    @XmlElement(name = "SFull")
    public String getSFull() {
        return SFull;
    }
    @XmlElement(name = "eps")
    public String getEps() {
        return eps;
    }
    @XmlElement(name = "deltaEps")
    public String getDeltaEps() {
        return deltaEps;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setE(String E) {
        this.E = E;
    }

    public void setDeltaE(String deltaE) {
        this.deltaE = deltaE;
    }

    public void setDeltaEPercent(String deltaEPercent) {
        this.deltaEPercent = deltaEPercent;
    }

    public void setPShPV(String PShPV) {
        this.PShPV = PShPV;
    }

    public void setS(String S) {
        this.S = S;
    }

    public void setDeltaS(String deltaS) {
        this.deltaS = deltaS;
    }

    public void setDeltaSPercent(String deltaSPercent) {
        this.deltaSPercent = deltaSPercent;
    }

    public void setSFull(String SFull) {
        this.SFull = SFull;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public void setDeltaEps(String deltaEps) {
        this.deltaEps = deltaEps;
    }
}