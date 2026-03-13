public class Person {
    //State (상태) - 명사
    private String name;
    private int age;
    private boolean gender;
    private boolean isMaried;
    private int children;

    //생성자


    public Person(){
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int children, boolean gender, boolean isMaried, int age) {
        this.name = name;
        this.children = children;
        this.gender = gender;
        this.isMaried = isMaried;
        this.age = age;
    }
}

