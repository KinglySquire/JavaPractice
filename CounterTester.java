class CounterTester {

    public static void main(String[] args)
    {
        Counter Counter1 = new Counter();
        Counter1.click();
        Counter1.click();
        Counter1.click();

        Counter1.getClicks();

        Counter1.click();

        Counter1.getClicks();

        Counter1.reset();

        Counter1.getClicks();
    }
}
