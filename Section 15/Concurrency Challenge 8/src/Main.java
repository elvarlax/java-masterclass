public class Main {

    public static void main(String[] args) {
        /*
        What is wrong with this code?
        The code has a deadlock.
        The threads are trying to get the same locks in different order
        so that is why it results in a deadlock.

        Example:
        Tutor gets the tutor lock and then tries to get the student lock.
        Student gets the student lock and then tries to get the tutor lock.
        Deadlock.

        Solution:
        1. Is a set of locks being obtained in a different order by multiple threads (that's the case here).
        If so, can we force all threads to obtain the locks in the same order?
        2. Are we over-synchronizing the code?
        3. Can we rewrite the code to break any circular call patterns?
        4. Would using ReentrantLocks objects help?
        */
        Tutor tutor = new Tutor();
        Student student = new Student(tutor);
        tutor.setStudent(student);

        Thread tutorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                tutor.studyTime();
            }
        });

        Thread studentThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student.handInAssignment();
            }
        });

        tutorThread.start();
        studentThread.start();
    }
}
