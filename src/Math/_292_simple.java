package Math;

/**
 * 你和你的朋友，两个人一起玩Nim 游戏：
 * 桌子上有一堆石头。
 * 你们轮流进行自己的回合,你作为先手。
 * 每一回合，轮到的人拿掉1 - 3 块石头。
 * 拿掉最后一块石头的人就是获胜者。
 * 假设你们每一步都是最优解。请编写一个函数，来判断你是否可以在给定石头数量为 n 的情况下赢得游戏。如果可以赢，返回 true；
 * 否则，返回 false 。
 * @author keyboardhero
 * @create 2022-05-11 19:29
 */
public class _292_simple {
    //数学推理：当自己回合的石子数量是4的倍数时会输掉
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
