import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import camp.nextstep.edu.missionutils.test.NsTest;
import gpacalc.Application;
import org.junit.jupiter.api.Test;

public class ApplicationTest extends NsTest {

    @Test
    void 평점평균_계산() {
        run("데이타구조-3-A0,자바프로그래밍언어-3-B+,컴퓨터구조-3-C0,컴퓨터네트워크-3-D+",
                "미술의이해-3-P,교양특론3-1-NP,기독교의이해-2-F");
        assertThat(output()).contains(
                "<과목 목록>",
                "[전공] 데이타구조,3,A0",
                "[전공] 자바프로그래밍언어,3,B+"
                "[전공] 컴퓨터구조,3,C0",
                "[전공] 컴퓨터네트워크,3,D+",
                "[교양] 미술의이해,3,P",
                "[교양] 교양특론3,1,NP",
                "[교양] 기독교의이해,2,F",
                "<취득학점>",
                "15학점",
                "<평점평균>",
                "2.36 / 4.5",
                "<전공 평점평균>",
                "2.75 / 4.5"
        );
    }

    @Test
    void 예외처리_잘못된_성적_입력() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> {
                    run("자바프로그래밍언어-3-E0", "한동인성교육-1-P");
                    run("자바프로그래밍언어-3-A+", "한동인성교육-1-PD");
                });
    }

    @Test
    void 예외처리_잘못된_학점_입력() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> {
                    run("프로그래밍언어론-5-A0", "한동인성교육-1-P");
                    run("프로그래밍언어론-3-A0", "한동인성교육-0-P");
                });
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
