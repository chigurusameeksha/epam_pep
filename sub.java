package epam_calci;
public class sub implements calculator
{

    @Override
    public void compute(int n1, int n2) {
        int substract = n1 - n2;
        System.out.println("Substraction of two numbers is "+substract);
    }

}