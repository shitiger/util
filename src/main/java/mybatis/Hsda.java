package mybatis;

import java.sql.SQLOutput;

/**
 * @author stone tiger
 * @Description:
 * @date 2020/8/3
 */
public class Hsda {

    public static String s1="";

    public static void sda(int i) {
       try {
           if (i == 1){
               throw new Exception();
           }
           s1 +="1";
       }catch (Exception e){
           s1 +="2";
           return;
       }finally {
           s1+="3";
       }
       s1+="4";
    }

    public static void main(String[] args) {
        try {
            System.out.println("hello,j");
            System.exit(0);
        }finally {
            System.out.println("222222");
        }

    }
}
