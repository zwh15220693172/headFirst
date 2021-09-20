package bridge.brand;

import bridge.brand.Brand;

public class HuaWei implements Brand {
    @Override
    public String open() {
        return "华为手机开机";
    }

    @Override
    public String call() {
        return "华为手机打电话";
    }

    @Override
    public String close() {
        return "华为手机关机";
    }
}
