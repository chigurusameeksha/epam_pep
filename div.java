package epam_calci;

public class div implements calculator
{

    @Override
    public void compute(int n1, int n2) {
        int d= n1/n2;
        System.out.println("Divison of two numbers is "+d);
    }

}