import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name ");
        System.out.println("Family ");
        System.out.println("Age ");
        System.out.println("Work ");
        System.out.println("Salary ");
        String name1 = input.next();
        String family1 = input.next();
        int age1 = input.nextInt();
        String work1 = input.next();
        int salary1 = input.nextInt();
        String name2 = input.next();
        String family2 = input.next();
        int age2 = input.nextInt();
        String work2 = input.next();
        int salary2 = input.nextInt();
        String name3 = input.next();
        String family3 = input.next();
        int age3 = input.nextInt();
        String work3 = input.next();
        int salary3 = input.nextInt();
        HashMap<Human, Work> working = new HashMap<Human, Work>();
        working.put(new Human(name1, family1, age1), new Work(work1, salary1));
        working.put(new Human(name2, family2, age2), new Work(work2, salary2));
        working.put(new Human(name3, family3, age3), new Work(work3, salary3));
        for (Human i : working.keySet()) {
            System.out.println("Name: " + i);
            System.out.println("Working: " + working.get(i));
        }

    }
}
