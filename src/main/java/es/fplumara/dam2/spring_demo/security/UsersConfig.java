package es.fplumara.dam2.spring_demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;




@Configuration
public class UsersConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsManager users(PasswordEncoder encoder) {
        // Aquí defines los usuarios
        UserDetails user = User.withUsername("user")   // <- aquí va tu user
                .password(encoder.encode("user123"))
                .roles("USER")
                .build();

        UserDetails admin = User.withUsername("admin") // <- aquí va tu admin
                .password(encoder.encode("admin123"))
                .roles("ADMIN")
                .build();

        // Y aquí devuelves el UserDetailsManager con los usuarios
        return new InMemoryUserDetailsManager(user, admin);
    }
}
