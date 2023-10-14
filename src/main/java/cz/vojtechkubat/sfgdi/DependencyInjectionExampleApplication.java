package cz.vojtechkubat.sfgdi;

import cz.vojtechkubat.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(
		basePackages = {
				"cz.vojtechkubat.sfgdi",
				"cz.vojtechkubat.pets"
		}
)
@SpringBootApplication
public class DependencyInjectionExampleApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionExampleApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println("------ i18");
		System.out.println(i18nController.sayHello());

//		getBean - name parametr musi zacinat malym pismenem, neni to primo nazev tridy
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("------ PRIMARY");
		StringBuilder strb = new StringBuilder();
		strb.append(">>> returned value: ");
		strb.append(myController.sayHello());

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

		System.out.println("----- PET CONTROLLER");
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println(petController.saySomething());

	}

}
