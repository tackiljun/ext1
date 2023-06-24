package org.exam.ext1.ext1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"org.oneteam.oneteam.**.mappers"})
public class Ext1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ext1Application.class, args);
	}

}
