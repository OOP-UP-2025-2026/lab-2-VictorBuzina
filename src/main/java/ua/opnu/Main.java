package ua.opnu;

public class Main {
    public static void main(String[] args) {
        // --- Student ---
        Student st = new Student("Іван", 2);
        st.addCourse("Математика");
        st.addCourse("Програмування");

        System.out.println(st.getName() + ": кількість вивчаємих дисциплін - " + st.getCourseCount());
        System.out.println(st.getName() + ": рік навчання - " + st.getYear());
        System.out.println(st.getName() + ": заплатив за навчання - " + st.getTuition());

        // --- BankAccount ---
        BankAccount acc1 = new BankAccount();
        acc1.name = "Петро";
        acc1.deposit(1000);

        BankAccount acc2 = new BankAccount();
        acc2.name = "Оксана";

        acc1.transactionFee = 10;
        acc1.transfer(acc2, 500);

        System.out.println(acc1.name + ": баланс = " + acc1.getBalance());
        System.out.println(acc2.name + ": баланс = " + acc2.getBalance());

        // --- TimeSpan ---
        TimeSpan span1 = new TimeSpan(2, 30);
        span1.add(1, 45); // 4:15
        System.out.println("Інтервал часу: " + span1.getHours() + " год " + span1.getMinutes() + " хв");
    }
}
