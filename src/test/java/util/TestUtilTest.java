package util;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Scanner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestUtilTest {

    /*
      Junit이라는 로봇이 app을 편하게 이용할 수 있또록 도와주는 TestUtil 생성
      1. 뭘 테스트해야할까?
        내 생각
            로봇에게 입력이 잘 들어오고 나가는지 테스트?
        깅사님 생각
            스캐너 만드는 것을 테스트
     */

    @Test
    @DisplayName("TestUtil.getScanner()")
    public void t1(){

        Scanner scanner = TestUtil.getScanner("""
          등록
          나의 죽음을 적들에게 알리지 말라!
          이순신
          """.stripIndent().trim());

        String cmd = scanner.nextLine();
        String content =  scanner.nextLine();
        String author = scanner.nextLine();

        assertThat(cmd).isEqualTo("등록");
        assertThat(content).isEqualTo("나의 죽음을 적들에게 알리지 말라!");
        assertThat(author).isEqualTo("이순신");
    }

    @Test
    @DisplayName("TestUtil.setOutToByteArray()- testUtil을 만드는 테스트")
    public void t2(){
        Scanner byteArrayOutputStream = TestUtil.setOutToByteArray();

        System.out.println("2 / 이순신 / 나의 죽음을 적들에게 알리지 말라!");
        String out = byteArrayOutputStream.toString().trim();
        TestUtil.clearSetOutToByteArray(byteArrayOutputStream);

        assertThat(out).isEqualTo("2 / 이순신 / 나의 죽음을 적들에게 알리지 말라!");
        System.out.println("이제는 화면에 출력됩니다.");

    }

}
