package com.example.obspringdatajpaULTIMO19;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringdatajpaUltimo19Application {

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(ObSpringdatajpaUltimo19Application.class, args);
		 CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println("find");
		System.out.println(repository.count());

		//crear y almacenar un coche en base de datos
		Coche toyota= new Coche(null,"Toyota","Prius","vale");
		repository.save(toyota);

		//recuperar un coche por id
		System.out.println(repository.findAll());

	}

}
