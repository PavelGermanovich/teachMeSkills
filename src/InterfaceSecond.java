public interface InterfaceSecond extends InterfaceFirst{
    void recheckSecond();

    @Override
    default void check() {
    }

    @Override
    default boolean repeat() {
        return false;
    }
}
