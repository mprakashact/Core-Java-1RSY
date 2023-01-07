public class Rectangle 
{

    int length;
    int width;

    void insert(int I, int W)
    {
        length=I;
        width=W;
    }

    void CalculateArea()
    {
        System.out.println(length*width);
    }

    class TestRectangle2 
    {
        public static void main (String args[])
        {
            Rectangle r1=new Rectangle(), r2=new Rectangle(); 

            r1.insert(11, 5);
            r2.insert(3, 15);

            r1.CalculateArea();
            r2.CalculateArea();
        }

    }
}



/* public class Rectangle 
{
    int length;
    int width;

    void insert(int I, int W) 
    {
        length = I;
        width = W;
    }

    void calculateArea() 
    {
        System.out.println(length*width);
    }

    class TestRectangle1
    {
        public static void main(String args[])
        {
            Rectangle r1 = new Rectangle();
            Rectangle r2 = new Rectangle();

            r1.insert(11,5);
            r2.insert(3,15);

            r1.calculateArea();
            r2.calculateArea();
        }
    }
}
*/
