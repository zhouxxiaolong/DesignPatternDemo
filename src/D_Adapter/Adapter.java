package D_Adapter;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/10/9
 * Contact with 1016579848@qq.com
 *
 * @link
 */

/**
 * 这个就是3.5mm耳机和Lightning接口之间的适配器
 */
public class Adapter implements LightningInterface {

    private SimpleInterface simpleInterface;

    public Adapter(SimpleInterface simpleInterface) {
        this.simpleInterface = simpleInterface;
    }

    @Override
    public void playMusicWithLightning() {
        simpleInterface.playMusicWithSimple();
    }
}
