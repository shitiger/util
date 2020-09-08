package Bloom;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author stone tiger
 * @Description: ${todo}
 * @date 2019/5/22
 */
public class BloomFilterTest {

    private static int size = 1000000;


    private static BloomFilter<String> bloomFilter = BloomFilter.create(Funnels.stringFunnel(Charset.defaultCharset()), size);


    public static void main(String[] args) {
        String s1 = "ABCDEa123abc";
        String s2 = "ABCDFB123abc";
        System.out.println(s1.hashCode());  // 165374702
        System.out.println(s2.hashCode()); //  165374702
        for (int i = 0; i < size; i++) {
            bloomFilter.put("hehehehe"+i);
        }
        List<Integer> list = new ArrayList<Integer>(1000);
        // 故意取10000个不在过滤器里的值，看看有多少个会被认为在过滤器里
        for (int i = 0; i < size; i++) {
            if (bloomFilter.mightContain("hehehehe"+i)) {
                list.add(i);
            }
        }
        System.out.println("误判的数量：" + list.size());
    }

}
