public class HPPCShop extends PCShop {
    @Override
    public PC newPC(PCStatus type) {
        PC pc = null;

        switch (type) {
            case CHEAP -> pc = new HPCheapPC();
            case MEDIUM -> pc = new HPMediumPC();
            case EXPENSIVE -> pc = new HPExpensivePC();
        }
        return pc;
    }
}
