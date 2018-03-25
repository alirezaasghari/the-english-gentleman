package at.refugeescode.theenglishgentleman.englishgentleman;

import org.springframework.stereotype.Component;

@Component
public class Monocle {

    public void readNewspaper(Newspaper newspaper) {
        newspaper.read();
    }
}
