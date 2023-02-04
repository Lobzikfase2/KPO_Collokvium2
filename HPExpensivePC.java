public class HPExpensivePC extends PC {
    @Override
    public void buyComponents() {
        System.out.println("Покупаем дорогие компоненты для компьютера бренда HP");
    }

    @Override
    public void buildPC() {
        System.out.println("Собираем дорогой компьютер бренда HP");
    }
}
