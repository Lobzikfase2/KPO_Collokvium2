public class PCStoreTest {
    public static void main(String[] args) {
        System.out.println("---------Магазин компьютеров Acer---------");
        PCShop acerPCShop = new AcerPCShop();
        acerPCShop.sellPC(PCStatus.CHEAP);
        System.out.println("------------------");
        acerPCShop.sellPC(PCStatus.MEDIUM);
        System.out.println("------------------");
        acerPCShop.sellPC(PCStatus.EXPENSIVE);

        System.out.println("---------Магазин компьютеров HP-----------");
        PCShop hpPCShop = new HPPCShop();
        hpPCShop.sellPC(PCStatus.EXPENSIVE);
        System.out.println("------------------");
        hpPCShop.sellPC(PCStatus.MEDIUM);
        System.out.println("------------------");
        hpPCShop.sellPC(PCStatus.CHEAP);
        System.out.println("------------------------------------------");
    }
}