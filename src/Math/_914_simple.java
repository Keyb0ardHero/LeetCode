package Math;

/**
 * 给定一副牌，每张牌上都写着一个整数。
 * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
 * 每组都有 X 张牌
 * 组内所有的牌上都写着相同的整数。
 * 仅当你可选的 X >= 2 时返回true
 * @author keyboardhero
 * @create 2022-05-25 15:10
 */
public class _914_simple {
    public boolean hasGroupsSizeX(int[] deck) {  //求每个数字出现的频次
        int[] count = new int[10000];
        for (int c: deck) {
            count[c]++;
        }

        int g = -1;
        for (int i = 0; i < 10000; ++i) {
            if (count[i] > 0) {
                if (g == -1) {
                    g = count[i];
                } else {
                    g = gcd(g, count[i]);
                }
            }
        }
        return g >= 2;
    }

    public int gcd(int x, int y) {  //辗转相除法求最大公约数
        return x == 0 ? y : gcd(y % x, x);
    }

    /**
     * * 给定一副牌，每张牌上都写着一个整数。
     *  * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
     *  * 每组都有 X 张牌
     *  * 组内所有的牌上都写着相同的整数。
     *  * 仅当你可选的 X >= 2 时返回true
     */
    public boolean hasGroupsSizeX_rev1(int[] deck) {
        int[] count=new int[10000];
        for(int c:deck){
            count[c]++;
        }

        int g=-1;
        for(int i=0;i<10000;i++){
            if(count[i]>0){
                if(g==-1)
                    g=count[i];
                else
                    g=gcd(g,count[i]);
            }
        }
        return g>=2;
    }

    public int gcd_rev1(int x, int y) {
        return x==0?y:gcd(y%x,x);
    }
}
