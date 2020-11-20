package sean.study.jakarta.commons.lang;

import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CodeJudgeTest {

    @Mock
    private CodeJudge test = mock(CodeJudge.class);

    @Test
    public void judge1() {
        when(test.Judge("11111111")).thenReturn(true);
        CodeJudge test1 = new CodeJudge();
        if (test.Judge("11111111"))
        {
            System.out.println( "装模块测试成功！！！");
        }
    }

    @Test
    public void judgeLength1() {
        CodeJudge test1=new CodeJudge();
        test1.code="1111111";
        assertEquals(true,test1.JudgeLength(test1.code));
    }

    @Test
    public void judgeLength2() {
        CodeJudge test1=new CodeJudge();
        test1.code="111";
        assertEquals(false,test1.JudgeLength(test1.code));
    }

    @Test
    public void judgeNumber1() {
        CodeJudge test1=new CodeJudge();
        test1.code="1111asdasd";
        assertEquals(true,test1.JudgeNumber(test1.code));
    }

    @Test
    public void judgeNumber2() {
        CodeJudge test1=new CodeJudge();
        test1.code="!!^&asdasd";
        assertEquals(false,test1.JudgeNumber(test1.code));
    }

    @Test
    public void judgeletter1() {
        CodeJudge test1=new CodeJudge();
        test1.code="111SFW!@#";
        assertEquals(false,test1.Judgeletter(test1.code));
    }

    @Test
    public void judgeletter2() {
        CodeJudge test1=new CodeJudge();
        test1.code="111sfasfS!@";
        assertEquals(true,test1.Judgeletter(test1.code));
    }

    @Test
    public void judgeLetter1() {
        CodeJudge test1=new CodeJudge();
        test1.code="11sfag!@$@#";
        assertEquals(false,test1.JudgeLetter(test1.code));
    }

    @Test
    public void judgeLetter2() {
        CodeJudge test1=new CodeJudge();
        test1.code="SAFAF425sda@$!";
        assertEquals(true,test1.JudgeLetter(test1.code));
    }
}