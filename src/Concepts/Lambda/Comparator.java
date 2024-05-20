package Concepts.Lambda;

@FunctionalInterface
public interface Comparator {

    public int compareTo(double d1, double d2);

    default void check()
    {
        System.out.println("Hey i'm default function");
    }
}
