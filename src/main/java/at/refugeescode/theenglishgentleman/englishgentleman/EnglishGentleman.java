package at.refugeescode.theenglishgentleman.englishgentleman;

import org.springframework.stereotype.Component;

@Component
public class EnglishGentleman {

    private Monocle monocle;
    private Lighter lighter;
    private boolean read;
    private boolean smoked;

    public EnglishGentleman(Monocle monocle, Lighter lighter) {
        this.monocle = monocle;
        this.lighter = lighter;
    }

    public void read(Newspaper newspaper) {
        monocle.readNewspaper(newspaper);
        read = true;
    }

    public void smoke(Cigar cigar) {
        lighter.light(cigar);
        try {
            smoked = cigar.cigarIsLit();
        } catch (Exception e) {

        }
    }

    public boolean hadAGoodDay() {
        return read && smoked;
    }
}
