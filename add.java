package epam_calci;

public class add implements calculator
{

    @Override
    public void compute(int n1, int n2) {
        int add = n1 + n2;
        System.out.println("The Addition of two numbers is "+add);
    }

}