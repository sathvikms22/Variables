package mobile;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MobileSim {
	public static void main(String[] args) {
     
		Resource resource = new ClassPathResource("MobileSim.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Mobile mobile = (Mobile) beanFactory.getBean("myMobile");
		mobile.mob();
		
	}
}
