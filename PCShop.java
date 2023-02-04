public abstract class PCShop {
    public PC sellPC(PCStatus type) {
        PC pc = newPC(type);
        pc.buyComponents();
        pc.buildPC();
        System.out.println("Ваш ПК собран, можете забрать его по адресу: Покровский бульвар 11, кабинет R613");
        return pc;
    }

    protected abstract PC newPC(PCStatus type);
}
