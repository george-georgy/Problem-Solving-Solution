package basics;

// program that shows the terms of the geometric sequence 1 , 3 , 9 that stops before the value exceeds 1000.
class GeometricSequence
{
    public static void main(String[] args)
    {
        int n = 1;
        while(n <= 1000){
            System.out.println(n);
            n = n * 3;

        }
    }
}
