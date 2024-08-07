package CollectionAndMapAPI;

import java.util.ArrayDeque;

public class ArrayDequeExplain {
    public static void main(String[] args) {
        // it store both type of data homogenious type and hetrogenious type of data also
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(34);
        ad1.add(21);
        // in the Deque one is benefid we can add value fist and last directly we have option
        System.out.println(ad1);
        ad1.addFirst("jitu");
        ad1.addLast("Sharma");
        System.out.println(ad1);

        // duplicate value will be allowed 
        ad1.add(54);
        ad1.add(54);
        System.out.println(ad1);

        ad1.add("JITUSHARMA");
        ad1.add("JITUSHARMA");
        System.out.println(ad1);


        // offer method may be rejected and accepted both condition will be followed
        ad1.offer(59);
        ad1.offerFirst(88);
        ad1.offerLast(33);
        System.out.println(ad1);

    }
}
