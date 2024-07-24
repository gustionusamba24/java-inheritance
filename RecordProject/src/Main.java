public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student student = new Student("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Jane";
                        case 3 -> "Peter";
                        case 4 -> "Parker";
                        case 5 -> "Harry";
                        default -> "Anonymous";
                    },
                    "5/11/1985",
                    "Java Masterclass"
            );
            System.out.println(student);
        }

    }
}
