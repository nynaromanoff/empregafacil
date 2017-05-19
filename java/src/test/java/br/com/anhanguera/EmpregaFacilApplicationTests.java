package br.com.anhanguera;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.anhanguera.config.EmpregaFacilConfig;
import br.com.anhanguera.repository.DadosPessoaisdoCandidato;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={EmpregaFacilApplication.class,EmpregaFacilConfig.class})
public class EmpregaFacilApplicationTests {
	@Autowired
	private DadosPessoaisdoCandidato test;

	@Test
	public void contextLoads() {
		System.out.println(test.findAll());
	}	

}
