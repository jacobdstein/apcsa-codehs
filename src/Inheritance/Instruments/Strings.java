public class Strings extends Instrument
{
    private boolean usesBow;
    
    public Strings(String name, String family, boolean usesBow) {
        super(name, family);
        this.usesBow = usesBow;
    }
    
    public Strings(String name, boolean usesBow) {
        super(name);
        this.usesBow = usesBow;
    }
    
    public boolean getUsesBow() {
        return usesBow;
    }
    public void setUsesBow(boolean usesBow) {
        this.usesBow = usesBow;
    }
}