package Math;

/**
 * 给你一个整数 n（10 进制）和一个基数 k ，请你将 n 从 10 进制表示转换为 k 进制表示，计算并返回转换后各位数字的总和 。
 * 转换后，各位数字应当视作是 10 进制数字，且它们的总和也应当按 10 进制表示返回。
 * @author keyboardhero
 * @create 2022-06-23 16:34
 */
public class _1837_simple {
    public int sumBase(int n, int k) {
        int res=0;
        while(n!=0){
            res+=n%k;
            n/=k;
        }
        return res;
    }
}
