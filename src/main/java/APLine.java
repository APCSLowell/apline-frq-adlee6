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
    return - (double) a/b;
  }

  public boolean isOnLine(int a, int b) {
    return (i*a)+(j*b)+k == 0;
  }
  
}
