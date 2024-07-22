public class Wind extends Instrument
{
    private boolean usesReed;
    
    public Wind (String name, String family, boolean usesReed) {
        super(name, family);
        this.usesReed = usesReed;
    }
    
    public boolean getUsesReed() {
        return usesReed;
    }
    public void setUsesReed(boolean usesRead) {
        this.usesReed = usesReed;
    }
}