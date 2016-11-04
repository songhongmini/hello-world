package zuoye;
import java.util.ArrayList;


/**
 * Created by Administrator on 2016/11/4.
 */
public class ai {
    public static void main(String[] args) {
        ArrayList <String> strings = new ArrayList <>(9);
        strings.add("男：在？");
        strings.add("女：在啊，怎么了啊？");
        strings.add("男：没怎么啊，就是问问你在不。");
        strings.add("女：好吧，感觉有点无聊啊。");
        strings.add("男：我也是觉得也。听说最近苹果除了新的MacBook Pro，要不我们去看看？");
        strings.add("女：好啊，你等我一下，我准备一下。");
        strings.add("男：还要准备啊，就这样去就好了啊。");
        strings.add("女:当然了，万一我看上了那个电脑怎么办？");
        strings.add("男：能怎么办 啊，看看就走啊，你还想买啊？");
        strings.add("女：当然。");
        strings.add("男：靠颜值？");
        strings.add("女：你个lou逼，老娘卡里有两万。");
        strings.add("男：我能抱你大腿吗？");
        strings.add("女：你个色逼，滚。。");
        for (String number :  strings)
            System.out.println("台词→" + number);
    }}
