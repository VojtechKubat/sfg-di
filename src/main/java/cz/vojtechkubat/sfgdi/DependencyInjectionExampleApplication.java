package cz.vojtechkubat.sfgdi;

import cz.vojtechkubat.sfgdi.controllers.ConstructorInjectedController;
import cz.vojtechkubat.sfgdi.controllers.MyController;
import cz.vojtechkubat.sfgdi.controllers.PropertyInjectedController;
import cz.vojtechkubat.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExampleApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionExampleApplication.class, args);

//		getBean - name parametr musi zacinat malym pismenem, neni to primo nazev tridy
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		StringBuilder strb = new StringBuilder();
		strb.append(">>> returned value: ");
		strb.append(greeting);

		System.out.println(strb);

		System.out.println("------ Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------ Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
