package bridge.type;

import bridge.brand.Brand;

public class FlipPhone extends MobileType{

    public FlipPhone(Brand brand) {
        super(brand);
    }

    @Override
    public String display() {
        return "翻盖";
    }
}
