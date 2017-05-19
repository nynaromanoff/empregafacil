package br.com.anhanguera.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableJpaRepositories(basePackages={"br.com.anhanguera"})
public class EmpregaFacilConfig {
	
	@Bean(destroyMethod = "close")
	public DataSource getDataSource(Environment env){
		HikariConfig dataSource = new HikariConfig ();
		dataSource.setDriverClassName(env.getRequiredProperty("spring.datasource.driver-class-name"));
		dataSource.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
		dataSource.setUsername(env.getRequiredProperty("spring.datasource.username"));
		dataSource.setPassword(env.getRequiredProperty("spring.datasource.data-password"));
		
		return new HikariDataSource(dataSource);
	}

}
