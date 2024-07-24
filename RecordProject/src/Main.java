public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent student = new LPAStudent("S92300" + i,
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

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent lpaStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        lpaStudent.setClassList(lpaStudent.classList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(lpaStudent.name() + " is taking " + lpaStudent.classList());
    }
}
