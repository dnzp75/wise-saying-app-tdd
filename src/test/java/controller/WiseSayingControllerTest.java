package controller;

import static org.assertj.core.api.Assertions.assertThat;


import com.WearWeather.wear.App;
import java.io.ByteArrayOutputStream;
import java.util.Scanner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.WearWeather.wear.util.TestUtil;

public class WiseSayingControllerTest {

    @Test
    @DisplayName("==명언 앱==")
    public void t1() {

        //        WiseSayingController wiseSayingController = new WiseSayingController();
        //
        //        String appTitle = wiseSayingController.getAppTitle(); // 제목 생성 메서드 호출
        //
        //        assertThat(appTitle).isEqualTo("==명언 앱==");

        Scanner scanner = TestUtil.getScanner("종료");

        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();

        App app = new App(scanner);
        app.run();

        String output = outputStream.toString();

        TestUtil.clearSetOutToByteArray(outputStream);

        assertThat(output)
          .contains("==명언 앱==");


    }

}
