package school.hei.springSecurity.security;
import school.hei.springSecurity.service.OtherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@Slf4j
public class ConfigSecurity extends WebSecurityConfigurerAdapter {
    private OtherService OtherService;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(HttpMethod.GET,"/User/**").permitAll()
                .antMatchers(HttpMethod.GET,"/Role/**").permitAll()
                .antMatchers("/test/Roles/Admin").hasRole("Admin")
                .antMatchers("/test/Roles/User").hasRole("User")
                .antMatchers("/test/Roles/User").hasAnyRole("Admin", "User")
                .and()
                .formLogin()
                .and()
                .logout().permitAll()
                .and()
                .csrf().disable()
                .httpBasic();
    }

    @Bean
    protected PasswordEncoder getPass (){
        return new BCryptPasswordEncoder();
    }
}

