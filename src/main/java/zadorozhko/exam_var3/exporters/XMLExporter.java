/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadorozhko.exam_var3.exporters;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import zadorozhko.exam_var3.manipulation.Energy;
import zadorozhko.exam_var3.manipulation.Nuclide;
/**
 *
 * @author Dasha
 */
public class XMLExporter extends Exporter {
    public void createEnergy(String path, Energy energy) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Energy.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(energy, new File(path));
    }
    
    public void createNuclide(String path, Nuclide nuclide) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Nuclide.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(nuclide, new File(path));
    }
    
}
