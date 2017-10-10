package D_Adapter;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/10/9
 * Contact with 1016579848@qq.com
 *
 * @link
 */
public class Iphone {
    private LightningInterface lightningInterface;

    public Iphone(LightningInterface lightningInterface) {
        this.lightningInterface = lightningInterface;
    }

    public void playMusic() {
        System.out.println("iphoe正在通过Lightning接口播放音乐...");
        lightningInterface.playMusicWithLightning();
    }
}
