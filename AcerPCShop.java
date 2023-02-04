public class AcerPCShop extends PCShop {
    @Override
    public PC newPC(PCStatus type) {
        PC pc = null;

        switch (type) {
            case CHEAP -> pc = new AcerCheapPC();
            case MEDIUM -> pc = new AcerMediumPC();
            case EXPENSIVE -> pc = new AcerExpensivePC();
        }
        return pc;
    }
}