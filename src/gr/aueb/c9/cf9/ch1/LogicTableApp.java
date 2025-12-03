package gr.aueb.cf.cf9.ch2;

public class LogicTableApp {
    public static void main(String[] args) {
// --- Εκτύπωση με printf (μορφοποιημένα) ---
        System.out.println("Πίνακας Αλήθειας με printf:");
        System.out.println("a\tb\ta && b\ta || b\t!a\t!b");
        System.out.println("------------------------------------");


        boolean[] values = {false, true};

        for (boolean a : values) {
            for (boolean b : values) {
                System.out.printf("%d\t%d\t%s\t%s\t%s\t%s%n",
                        (a ? 1 : 0),
                        (b ? 1 : 0),
                        (a && b),
                        (a || b),
                        (!a),
                        (!b));
            }
        }

        // Κενή γραμμή για διαχωρισμό
        System.out.println("\n------------------------------------\n");

        // --- Εκτύπωση με println (απλή εκτύπωση κάθε γραμμής) ---
        System.out.println("Πίνακας Αλήθειας με println:");
        System.out.println("a b a&&b a||b !a !b");
        System.out.println("------------------------------------");

        for (boolean a : values) {
            for (boolean b : values) {
                System.out.println(
                        (a ? 1 : 0) + " " +
                                (b ? 1 : 0) + " " +
                                (a && b) + " " +
                                (a || b) + " " +
                                (!a) + " " +
                                (!b)
                );
            }
        }
    }


}

