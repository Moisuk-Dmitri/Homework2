public class Main {
    public static void main(String[] args) {
        // Task 1
        var dog = 8.0;
        System.out.println("dog = " + dog);
        var cat = 3.6;
        System.out.println("cat = " + cat);
        var paper = 763789;
        System.out.println("paper = " + paper);

        // Task 2
        dog += 4;
        System.out.println("dog = " + dog);
        cat += 4;
        System.out.println("cat = " + cat);
        paper += 4;
        System.out.println("paper = " + paper);

        // Task 3
        dog -= 3.5;
        System.out.println("dog = " + dog);
        cat -= 1.6;
        System.out.println("cat = " + cat);
        paper -= 7639;
        System.out.println("paper = " + paper);

        // Task 4
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        // Task 5
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        // Task 6
        var fBoxerWeight = 78.2;
        var sBoxerWeight = 82.7;
        System.out.println("Total weight of two boxers = " + (fBoxerWeight + sBoxerWeight));
        System.out.println("Mass difference = " + (sBoxerWeight - fBoxerWeight));

        // Task 7
        System.out.println("Remainder of division between two weights = " + (sBoxerWeight % fBoxerWeight));

        // Task 8
        System.out.println("Total employees in the company = " + 640 / 8 + " persons");
        System.out.println("If a company employs " + (640 / 8 + 94) + " persons, then a total of " + (640 / 8  + 94) * 8 + " hours of work can be divided between employees");
    }
}