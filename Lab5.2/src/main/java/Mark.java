public class Mark {
    private int definedMark;

    public Mark(int definedMark) {
        this.definedMark = definedMark;
    }

    public int getDefinedMark() {
        return definedMark;
    }

    public void setDefinedMark(int definedMark) {
        this.definedMark = definedMark;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "definedMark=" + definedMark +
                '}';
    }
}
