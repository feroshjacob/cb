package cb.utils;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import cb.string.HammingDistance;


public class XMLUtils {
	
	
	public  String toXML(Object[] objects, String root) {
		
		try {
			JAXBContext context = JAXBContext.newInstance(objects.getClass());
			 Marshaller mar= context.createMarshaller();	
			 mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			 mar.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
			 StringWriter w = new StringWriter();
			  mar.marshal(new JAXBElement(new QName(root), objects.getClass(), objects), w);
			 return w.toString();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			return "Unable to convert to XML";
	}
	public  String toXML(Object obj) {
		
		try {
			JAXBContext context = JAXBContext.newInstance(obj.getClass());
			 Marshaller mar= context.createMarshaller();	
			 mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			 mar.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
			 StringWriter w = new StringWriter();
			 mar.marshal(obj , w);
			 return w.toString();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			return "Unable to convert to XML";
	}
	
	public static void main(String[] args) {
		
		 System.out.println(new XMLUtils().toXML(new HammingDistance()));
	}
	
}
