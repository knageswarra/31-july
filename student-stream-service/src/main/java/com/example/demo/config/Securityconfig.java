package com.example.demo.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.context.annotation.Bean;
import static org.springframework.security.config.Customizer.withDefaults;
/**@EnableWebSecurity
public class Securityconfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable();
	}

}**/
@EnableWebSecurity
public class Securityconfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests().anyRequest().authenticated().and().httpBasic(withDefaults());
        http.cors().disable();
        http.csrf().disable();
		return http.build();
	}
}
