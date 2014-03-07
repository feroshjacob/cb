package cb.utils;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;
 
@XmlRootElement(name = "customer")
public class TestObject {
	 
	
	 public TestObject() {
		// TODO Auto-generated constructor stub
	}
	 public static void main(String[] args) throws JAXBException {
		 TestObject[] array = new TestObject[2];
		 array[0]=new TestObject(1, "fer");
		 array[1]=new TestObject(2, "jaco");
		 
 		 JAXBContext context = JAXBContext.newInstance(array.getClass());
		 Marshaller mar= context.createMarshaller();
		 mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 mar.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
		  final StringWriter w = new StringWriter();
		  mar.marshal(new JAXBElement(new QName("soc"), array.getClass(), array), w);
		 System.out.println(w.toString());
	}
		private int i =2;
		private String s="hello";
		
		public TestObject(int i, String s) {
			super();
			this.i = i;
			this.s = s;
		}
		public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		}
		public String getS() {
			return s;
		}
		public void setS(String s) {
			this.s = s;
		}
		
	}
