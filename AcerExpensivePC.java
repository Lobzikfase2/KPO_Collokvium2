public class AcerExpensivePC extends PC {
    @Override
    public void buyComponents() {
        System.out.println("Покупаем дорогие компоненты для компьютера бренда Acer");
    }

    @Override
    public void buildPC() {
        System.out.println("Собираем дорогой компьютер бренда Acer");
    }
}
