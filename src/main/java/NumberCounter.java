import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicInteger;

public class NumberCounter {

    /**
     * Given an array of numbers and an array of maxes.
     * The program will count the amount of numbers that are lower or equal to each one of the maxes.
     * Example:
     * Numbers: [1,1,2,6]
     * Maxes: [-1,1,7]
     * Result: [0,2,4]
     * @param numbers - the array of numbers
     * @param maxes - the array of maxes
     * @return - the count of numbers lower or equal to the ones in maxes
     */
    public int[] getSmallerThanCount(final int[] numbers, final int[] maxes) {
        Map<Integer, AtomicInteger> orderedNumbersCount = orderedCount(numbers);
        Map<Integer, Integer> numbersCountAccumulated = accumulate((ConcurrentSkipListMap) orderedNumbersCount);

        return fetchSmallerThanCount((ConcurrentSkipListMap) numbersCountAccumulated, maxes);
    }

    protected Map<Integer, AtomicInteger> orderedCount(int[] numbers) {
        Map<Integer, AtomicInteger> orderedCount = new ConcurrentSkipListMap<>();
        Arrays.stream(numbers)
                .forEach(number -> {
                    Optional.ofNullable(
                            orderedCount.putIfAbsent(number, new AtomicInteger(1))
                    ).ifPresent(atomicInteger -> orderedCount.get(number).incrementAndGet());
                });
        return orderedCount;
    }

    protected Map<Integer, Integer> accumulate(ConcurrentSkipListMap<Integer, AtomicInteger> orderedNumbersCount) {
        Map<Integer, Integer> accumulated = new ConcurrentSkipListMap<>();

        Integer accumulator = 0;
        while (!orderedNumbersCount.isEmpty()) {
            Map.Entry<Integer, AtomicInteger> smallestEntry = orderedNumbersCount.pollFirstEntry();
            accumulator += smallestEntry.getValue().get();
            accumulated.put(smallestEntry.getKey(), accumulator);
        }
        return accumulated;
    }

    protected int[] fetchSmallerThanCount(ConcurrentSkipListMap<Integer, Integer> numbersCountAccumulated, int[] maxes) {
        return Arrays.stream(maxes)
                .mapToObj(max -> numbersCountAccumulated.floorEntry(max))
                .mapToInt(entry -> {
                    if (entry == null) {
                        return 0;
                    }
                    return entry.getValue();
                })
                .toArray();
    }
}
