public class HPMediumPC extends PC {
    @Override
    public void buyComponents() {
        System.out.println("Покупаем средние компоненты для компьютера бренда HP");
    }

    @Override
    public void buildPC() {
        System.out.println("Собираем средний компьютер бренда HP");
    }
}
