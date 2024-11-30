package MDT.J04018;

/**
 *
 * @author Hoàng Hướng
 */
public class SoPhuc {
    private int x,y;

    public SoPhuc(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public SoPhuc sum(SoPhuc o){
        return new SoPhuc(x+o.x,y+o.y);
    }
    public SoPhuc mul(SoPhuc o){
        return new SoPhuc(x*o.x-y*o.y,x*o.y+y*o.x);
    }

    @Override
    public String toString() {
        if(y<0) return String.format("%d - %di", x,-y);
        return String.format("%d + %di", x,y);
    }
    
}
