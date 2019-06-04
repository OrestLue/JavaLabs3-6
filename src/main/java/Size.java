public class Size {
    private int hight;
    private int weight;

    public Size() {

    }

    Size(final int hightObj, final int weightObj) {
        this.hight = hightObj;
        this.weight = weightObj;
    }

    public final void setHight(final int hightObj) {
        this.hight = hightObj;
    }

    public final void setWeight(final int weightObj) {
        this.weight = weightObj;
    }

    public final int getHight() {
        return hight;
    }

    public final int getWeight() {
        return weight;
    }

    public final String serialize(char separator) {

        return "" + hight + separator + weight + separator;
    }
}
