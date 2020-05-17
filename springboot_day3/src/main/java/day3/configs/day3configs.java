package day3.configs;

import day3.domain.Ball;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Getter
@Setter
@ConfigurationProperties(prefix = "configure")
public class day3configs {
    Integer age;
    String name;
    @Bean
    public Ball getBall(){
        Ball ball =new Ball();
        ball.setSize(5);
        ball.setColor("white");
        return ball;
    }
}
