package com.example.demo.student;

import com.example.demo.JpaRepository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(

                    "Mariam",
                    "mariam.asd@gmail.com",
                    LocalDate.of(2000, Month.AUGUST,8)
            );

            Student alex = new Student(

                    "Alex",
                    "alex.asd@gmail.com",
                    LocalDate.of(1998, Month.OCTOBER,2)
            );

            repository.saveAll(
                    List.of(mariam,alex)
            );

        };
    }
}
