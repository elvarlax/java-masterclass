public class Main {

    public static void main(String[] args) {
        /*
        What is wrong with this code?
        It's a deadlock.

        Example:
        Tutor calls tutor.studyTime() and gets the tutor lock and then the student lock.
        Tutor then waits for the student and releases the tutor lock.
        Student calls the handInAssignment() and gets the tutor lock and calls getProgressReport().
        Student tries to get the student lock but the Tutor is still holding the lock.
        Deadlock.

        Solution:
        Check in the code where it calls wait() and see if it causes a deadlock.
        wait() method releases a lock before exiting the synchronized block,
        so releasing can lead to problems.
        */
        final NewTutor tutor = new NewTutor();
        final NewStudent student = new NewStudent(tutor);
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