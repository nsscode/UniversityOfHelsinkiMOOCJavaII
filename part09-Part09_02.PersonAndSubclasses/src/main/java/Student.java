public class Student extends Person {

    private int studyCredits = 0;

    public Student(String name, String adres) {
        super(name, adres);
        this.studyCredits = 0;
    }

    public int credits() {
        return this.studyCredits;
    }

    public void study() {
        this.studyCredits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.credits();
    }

}
