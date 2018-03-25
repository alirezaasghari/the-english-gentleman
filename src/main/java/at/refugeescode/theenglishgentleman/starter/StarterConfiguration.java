package at.refugeescode.theenglishgentleman.starter;

import at.refugeescode.theenglishgentleman.englishgentleman.Cigar;
import at.refugeescode.theenglishgentleman.englishgentleman.EnglishGentleman;
import at.refugeescode.theenglishgentleman.englishgentleman.Newspaper;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterConfiguration {

    @Bean
    ApplicationRunner startApplication(EnglishGentleman englishGentleman) {
        return args -> {
            englishGentleman.read(new Newspaper());
            englishGentleman.smoke(new Cigar());
            boolean hadAGoodDay = englishGentleman.hadAGoodDay();
            if (hadAGoodDay == true) {
                System.out.println("Yes, I had a good day");
            } else {
                System.out.println("No, I hadn't");
            }
        };
    }
}
