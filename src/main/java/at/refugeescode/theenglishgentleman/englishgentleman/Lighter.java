package at.refugeescode.theenglishgentleman.englishgentleman;

import org.springframework.stereotype.Component;

@Component
public class Lighter {

    public void light(Cigar cigar) {

        cigar.setIsLit(true);

    }
}
