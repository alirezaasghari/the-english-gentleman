package at.refugeescode.theenglishgentleman.englishgentleman;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class EnglishGentlemanTest {

    @Autowired
    private EnglishGentleman englishGentleman;

    @Test
    void hadAGoodDay() {
        englishGentleman.read(new Newspaper());
        englishGentleman.smoke(new Cigar());
        boolean hadAGoodDay = englishGentleman.hadAGoodDay();
        assertEquals(true, hadAGoodDay);
    }
}