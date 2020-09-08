package mybatis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import mybatis.util.Base64Util;
import mybatis.util.FileUtil;
import mybatis.util.HttpUtil;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author stone tiger
 * @Description: ${todo}
 * @date 2019/7/3
 */
public class TaskTest{

    public static void main(String[] args) throws Exception {
        // 通用识别url
        String otherHost = "https://aip.baidubce.com/rest/2.0/ocr/v1/business_license";
        // 本地图片路径
       // String filePath = "https://rms.zbj.com/resource/redirect?key=homesite%2ftask%2f286713f69974622644fec5b3effce37.jpg%2forigine%2fe2051f15-b64a-49bb-8ac9-b07e1312bc22";
        String filePath = "E:\\cb5973f4ceef4bfb44b327fecaf87459.jpg";
        Long s1 = System.currentTimeMillis();
        try {
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            String params = URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(imgStr, "UTF-8");
            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             */
            String accessToken = "24.150db852fa4364da7b215cc41e031591.2592000.1564552347.282335-16683930";

                String result = HttpUtil.post(otherHost, accessToken, params);
                JSONObject jsonObject = JSON.parseObject(result);
                String s2 = jsonObject.getString("error_code");
                if (s2!=null && s2.equals("17")){
                    System.out.println("Open api daily request limit reached");
                    return;
                }
                String ss = jsonObject.getString("words_result");
                JSONObject ss2 = JSON.parseObject(ss);
                String ssddd = ss2.getString("成立日期");
                JSONObject jsonObject1 = JSON.parseObject(ssddd);
                System.out.println(jsonObject1.getString("words").replaceAll("[年月]", "-").replace("日", ""));
            }catch(Exception e){
                System.out.println("111111");
            }
            System.out.println(System.currentTimeMillis() - s1);
        }
}
