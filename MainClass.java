package depndency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        ClassDI obj = (ClassDI) context.getBean("stdid1");
    	System.out.println("");
        System.out.println("----- Depndecy use by constructor ----");
    	System.out.println("");

        obj.display();
    }
}