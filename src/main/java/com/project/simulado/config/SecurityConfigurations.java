package com.project.simulado.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter{

//    @Autowired
//    private AuthenticationService authenticationService;
//
//    @Autowired
//    private TokenService tokenService;
//
//    @Autowired
//    private ConsumerRepository repository;
//
//    @Override
//    @Bean
//    protected AuthenticationManager authenticationManager() throws Exception {
//        return super.authenticationManager();
//    }
//
//
    //AUTORIZACAO
@Override
protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
//            .antMatchers(HttpMethod.GET, "/pedido").permitAll()
//            .antMatchers(HttpMethod.GET, "/pedido/{id}").permitAll()
//            .antMatchers(HttpMethod.POST, "/login").permitAll()
//            .antMatchers(HttpMethod.POST, "/cadastro").permitAll()
            .anyRequest().permitAll()
            .and().cors().and().csrf().disable();
}
//
//    //AUTENTICACAO
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(authenticationService).passwordEncoder(new BCryptPasswordEncoder());
//    }
//
//    //CONFIGURAÇÕES RECURSOS ESTÁTICOS(JS, CSS, IMGS, ETC)
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//    }

    //CONFIGURAÇÕES CORS
    @Bean
    public WebMvcConfigurer corsMappingConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:3001","https://snazzy-empanada-02955a.netlify.app", "https://alura-typer-amber.vercel.app")
                        .allowedMethods("*");
            }
        };
    }
}
