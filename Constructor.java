class Demo 
{
    public int iNo1;
    public int iNo2;

    public Demo() 
    {
        System.out.println("Inside default Constractor : ");
    }

    public Demo(int i, int j) {
        System.out.println("Inside parameries Constructor :");
    }
}

class Constructor
 {
    public static void main(String arg[]) 
    {
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo(11, 21);
    }
}