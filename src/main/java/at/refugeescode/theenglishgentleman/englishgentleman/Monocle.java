package at.refugeescode.theenglishgentleman.englishgentleman;

import org.springframework.stereotype.Component;

@Component
public class Monocle {

    public Newspaper read(Newspaper newspaper) {
        return newspaper;
    }
}
