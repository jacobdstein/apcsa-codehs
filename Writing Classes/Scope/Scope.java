public class Scope
{
    private int x;
    private int y;
    private int z;

    public Scope() {
        x = 3;
        y = 18;
        z = 21;
    }

    public void printScope(){
       System.out.println("t = " + getT() + "\nw = " + getW() + "\nx = " + x + 
       "\ny = "+ y + "\nz = " + z);
       
    }

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

    public int getW(){
        int w = x + z;
        return w;
    }

	public int getT() {
        int t = y + z;
		return t;
	}
}