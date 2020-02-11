package epam_calci;

public class mul implements calculator
{

    @Override
    public void compute(int n1, int n2) {
        int Multiplication = n1 * n2;
        System.out.println("Multiplication of two numbers is "+Multiplication);
    }

}