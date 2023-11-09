package practicePrograms;

public class TypeCastDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Implicit conversion

        short x = 10; // Initialize 'x' with a value
        int y = 30;
        byte z;

        x = (short) y; // Implicit conversion from int to short
        System.out.println(x);
        System.out.println(y);

        // Explicit conversion
        x = 10; // Reinitialize 'x' with a value
        z = (byte) x; // Explicit conversion from short to byte
        System.out.println(x);
        System.out.println(z);
    }

}
