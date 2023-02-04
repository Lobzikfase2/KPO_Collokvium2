public class AcerMediumPC extends PC {
    @Override
    public void buyComponents() {
        System.out.println("Покупаем средние компоненты для компьютера бренда Acer");
    }

    @Override
    public void buildPC() {
        System.out.println("Собираем средний компьютер бренда Acer");
    }
}
