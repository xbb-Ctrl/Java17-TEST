package org.xbb.javabasictest;

public class EnumeratedTypeTest {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        enum Length {small,medium,large}
        Length l = Length.small;
        System.out.println(l);
    }
}
