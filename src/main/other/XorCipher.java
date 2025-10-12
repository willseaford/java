void main(){
    byte a = 0b0100; //4
    byte b = 0b1101; //13

    System.out.println(String.format("a = %s", a));
    System.out.println(String.format("b = %s", b));

    byte aXORb = xor(a, b);
    System.out.println(String.format("A \u2295 B = %s", aXORb));

    byte bXorAXorB = xor(xor(a, b), b);
    System.out.println(String.format("A: B \u2295 (A\u2295B) = %s", bXorAXorB));

    byte aXorAXorB = xor(xor(a, b), a);
    System.out.println(String.format("B: A \u2295 (A\u2295B) = %s", aXorAXorB));


}

public static byte xor(byte input, byte key) {
    return (byte) (input ^ key);
}