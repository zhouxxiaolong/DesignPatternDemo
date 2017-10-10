package D_Adapter;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/10/9
 * Contact with 1016579848@qq.com
 *
 * @link
 */
public class IphoneHeadset implements LightningInterface{
    @Override
    public void playMusicWithLightning() {
        System.out.println("iphone原装耳机听音乐");
    }
}
