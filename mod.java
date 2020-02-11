package epam_calci;

public class mod implements calculator
{

    @Override
    public void compute(int n1, int n2) {
        int remainder = n1 % n2;
        System.out.println("After the Modulo operation remainder is"+remainder);
    }

}