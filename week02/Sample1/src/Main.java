//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("홍길동");
        person.setAge(30);
        person.setGender(true);
        person.setMaried(true);
        person.setChild(5);

        System.out.println(Person);

        Person hong = new Person("홍길동", 30, true, true, 5);
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.

        }
    }