package D_Adapter;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/10/9
 * Contact with 1016579848@qq.com
 *
 * @link
 */
public class SimpleHeadset implements SimpleInterface {
    @Override
    public void playMusicWithSimple() {
        System.out.println("使用3.5mm一般耳机听音乐");
    }
}
