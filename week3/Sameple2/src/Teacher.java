public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void teach() {
        System.out.printf("%s선생님(%s) : 자 이제 수업 시작하자\n");
    }

    public void close() {
            System.out.printf("%s선생님(%s) : 자 오늘 수업은 이상 입니다!\n", subject, name);
    }
}
