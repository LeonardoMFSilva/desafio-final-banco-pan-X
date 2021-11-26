package com.panacademy.grupox.bluebankx;

import com.panacademy.grupox.bluebankx.dao.EnderecoDaoImpl;
import com.panacademy.grupox.bluebankx.helpers.UF;
import com.panacademy.grupox.bluebankx.model.EnderecoModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.panacademy.grupox.bluebankx.model")
@SpringBootApplication
public class BlueBankXApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueBankXApplication.class, args);
	}

}
