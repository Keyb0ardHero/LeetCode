package Math;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个整数 n ，找出从 1 到 n 各个整数的 Fizz Buzz 表示，并用字符串数组 answer（下标从 1 开始）返回结果，其中：
 * answer[i] == "FizzBuzz" 如果 i 同时是 3 和 5 的倍数。
 * answer[i] == "Fizz" 如果 i 是 3 的倍数。
 * answer[i] == "Buzz" 如果 i 是 5 的倍数。
 * answer[i] == i （以字符串形式）如果上述条件全不满足。
 * @author keyboardhero
 * @create 2022-05-13 11:16
 */
public class _412_simple {
    public List<String> fizzBuzz(int n){
        List<String> list = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0)
                list.add("FizzBuzz");
            else if(i%3==0)
                list.add("Fizz");
            else if(i%5==0)
                list.add("Buzz");
            else
                list.add(String.valueOf(i));
        }
        return list;
    }

    /**
     *  * 给你一个整数 n ，找出从 1 到 n 各个整数的 Fizz Buzz 表示，并用字符串数组 answer（下标从 1 开始）返回结果，其中：
     *  * answer[i] == "FizzBuzz" 如果 i 同时是 3 和 5 的倍数。
     *  * answer[i] == "Fizz" 如果 i 是 3 的倍数。
     *  * answer[i] == "Buzz" 如果 i 是 5 的倍数。
     *  * answer[i] == i （以字符串形式）如果上述条件全不满足。
     */
    public List<String> fizzBuzz_rev1(int n){
        List<String> list = new ArrayList<String>();
        for(int i=1;i<=n;++i){
            if(i%3==0&&i%5==0)
                list.add("FizzBuzz");
            else if(i%3==0)
                list.add("Fizz");
            else if(i%5==0)
                list.add("Buzz");
            else
                list.add(String.valueOf(i));
        }
        return list;
    }
}
