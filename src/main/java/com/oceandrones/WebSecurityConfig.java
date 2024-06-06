package com.oceandrones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securtityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests()
                .requestMatchers("/usuarios/cadastrar", "/usuarios/buscar").permitAll()
                .anyRequest().authenticated()
                .and().formLogin().permitAll()
                .and().httpBasic();
        http.csrf().disable();
        return http.build();
    }


	/*@Bean
	public UserDetailsService userDetailsService(){
		UserDetails user =
				User.withDefaultPasswordEncoder()
				.username("oceandrones")
				.password("12345")
				.roles("ADM")
				.build();
		return new InMemoryUserDetailsManager(user);
	}*/
}