public class APLine
{
  private int i;
  private int j;
  private int k;

  public APLine(int a, int b, int c) {
    i = a;
    j = b;
    k = c;
  }

  public double getSlope() {
    return -((double) i/j);
  }

  public boolean isOnLine(int x, int y) {
    return (i*x)+(j*y)+k == 0;
  }
  
}
