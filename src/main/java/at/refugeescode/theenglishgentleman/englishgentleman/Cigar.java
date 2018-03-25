package at.refugeescode.theenglishgentleman.englishgentleman;

public class Cigar {

    private boolean isLit;

    public void setIsLit(boolean isLit) {
        this.isLit = isLit;
    }

    // Ensure that cigar is lit
    public boolean cigarIsLit() throws Exception {
        if (!isLit) {
            throw new Exception();
        }
        return true;
    }

}
