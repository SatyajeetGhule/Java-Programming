abstract class Base
{
    public int i,j;
    public int Addition(int a, int b)
    {
        return a + b;
    }
    abstract public int Substraction(int a, int b);
}
class Derived extends Base  //ERROR
{
    public int Substraction(int a, int b)
    {
        return a + b;
    }
    public int Multiplication(int a, int b)
    {
        return a * b;
    }
}
class AbstractionDemo3
{
    public static void main(String arg[])
    {
        Base bp = new Derived();
        int iRet = 0;

        iRet = bp.Addition(11, 21);
        System.out.println(iRet);

        //iRet = bp.Multiplication(11,10);   //ERROR
    }
}