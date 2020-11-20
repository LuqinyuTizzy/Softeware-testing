package sean.study.jakarta.commons.lang;

import java.util.*;

import org.apache.commons.lang3.StringUtils;

public class Apache {
    public static void main(String[] args)
    {
        CodeJudge A1=new CodeJudge();
        A1.code="1111111";
        A1.Judge(A1.code);
    }
}

class CodeJudge{
    public String code;
    public boolean Judge(String code)
    {
        boolean a1 = JudgeLength(code);
        boolean a2 = JudgeNumber(code);
        boolean a3 = Judgeletter(code);
        boolean a4 = JudgeLetter(code);
        if(a1&&a2&&a3&&a4)
        {
            System.out.println( "密码合法");
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean JudgeLength(String code)
    {
        if(code.length()<6)
        {
            System.out.println( "不合法！！！密码至少要有6个字符构成:");
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean JudgeNumber(String code)
    {
        char number='1';
        int position=-1;
        boolean HaveNumber;
        for(int i=1;i<=10;i++)
        {
            position=StringUtils.indexOf(code,number);
            if(position!=-1)
            {
                break;
            }
            number++;
        }
        if(position==-1)
        {
            System.out.println( "不合法！！！密码至少要有1个数字符构成:");
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean Judgeletter(String code)
    {
        char letter='a';
        int position=-1;
        boolean HaveNumber;
        for(int i=1;i<=26;i++)
        {
            position=StringUtils.indexOf(code,letter);
            if(position!=-1)
            {
                break;
            }
            letter++;
        }
        if(position==-1)
        {
            System.out.println( "不合法！！！密码至少要有1个小写字母构成:");
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean JudgeLetter(String code)
    {
        char Letter='A';
        int position=-1;
        for(int i=1;i<=26;i++)
        {
            position=StringUtils.indexOf(code,Letter);
            if(position!=-1)
            {
                break;
            }
            Letter++;
        }
        if(position==-1)
        {
            System.out.println( "不合法！！！密码至少要有1个大写字母构成:");
            return false;
        }
        else
        {
            return true;
        }
    }
}