package ch6.test;
//실행코드
public class MemberTest {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong","12345");
        if(result){
            System.out.println("로그인 됨");
        }
        else{
            System.out.println("id or password가 올바르지 못함");
        }
        
    }
}
