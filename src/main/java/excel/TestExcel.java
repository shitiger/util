package excel;

import java.util.List;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/12/24
 */
public class TestExcel {


    public static void main(String[] args) {
        ExcelUtil excelUtil = new ExcelUtil();
        List<List<String>> s =  excelUtil.read("D:\\离职顾问.xlsx",8);
        String s1 = "(";
        for (List<String> strings : s){

            s1+=strings.get(0)+",";
        }

        System.out.println(s1+")");
    }

}
