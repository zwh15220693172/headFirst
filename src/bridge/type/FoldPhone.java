package bridge.type;

import bridge.brand.Brand;

public class FoldPhone extends MobileType {
    public FoldPhone(Brand brand) {
        super(brand);
    }

    @Override
    public String display() {
        return "折叠";
    }
}
