public abstract class Apiece {
    protected String inKind;
    public Apiece(String inKind){
        this.inKind = inKind;
    }
    //下棋时落子的位置
    public abstract void Play(int x,int y);
}
