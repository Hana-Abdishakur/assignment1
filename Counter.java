public class Counter {

    private int count;

    private static int totalCount;

    public Counter() {
        count = 0;
    }

    public void increment() {
        count++;
        totalCount++;
    }

    public int getCount() {
        return count;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public void displayCounts() {

        int localCount = count + 5;
        System.out.println("Instance Count: " + count);
        System.out.println("Local Count (count + 5): " + localCount);
        System.out.println("Total Count (across all instances): " + totalCount);
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.increment();
        counter1.increment();
        counter2.increment();

        counter1.displayCounts();
        counter2.displayCounts();

        System.out.println("Total count across all counters: " + Counter.getTotalCount());
    }
}
