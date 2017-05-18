import static org.assertj.core.api.Java6Assertions.assertThat;

import org.junit.Test;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicInteger;

public class NumberCounterTest {

    private NumberCounter numberCounter = new NumberCounter();

    @Test
    public void shouldCountTheNumbersSmallerThanMaxes() {
        int[] nums = new int[]{2, 10, 5, 4, 8};
        int[] maxes = new int[]{3, 1, 7, 8};
        int[] results = new int[]{1, 0, 3, 4};
        assertThat(numberCounter.getSmallerThanCount(nums, maxes)).containsExactly(results);

        nums = new int[]{2, 1, 1, 3, 3, 1, 4, -1, -1};
        maxes = new int[]{-2, 2, 11};
        results = new int[]{0, 6, 9};
        assertThat(numberCounter.getSmallerThanCount(nums, maxes)).containsExactly(results);
    }

    @Test
    public void shouldOrderAndCountArray() {
        Map<Integer, AtomicInteger> orderedCount = numberCounter.orderedCount(new int[]{2, 1, 1, 3, 3, 1, 4, -1, -1});

        assertThat(orderedCount.size()).isEqualTo(5);
        assertThat(orderedCount.get(-1).get()).isEqualTo(2);
        assertThat(orderedCount.get(1).get()).isEqualTo(3);
        assertThat(orderedCount.get(2).get()).isEqualTo(1);
        assertThat(orderedCount.get(3).get()).isEqualTo(2);
        assertThat(orderedCount.get(4).get()).isEqualTo(1);
        assertThat(orderedCount.get(44)).isNull();
    }

    @Test
    public void shouldAccumulateNumbers() {
        Map<Integer, Integer> accumulatedNumbers = numberCounter
                .accumulate((ConcurrentSkipListMap) numberCounter
                        .orderedCount(new int[]{2, 1, 1, 3, 3, 1, 4, -1, -1}));

        assertThat(accumulatedNumbers.get(-1)).isEqualTo(2);
        assertThat(accumulatedNumbers.get(1)).isEqualTo(5);
        assertThat(accumulatedNumbers.get(2)).isEqualTo(6);
        assertThat(accumulatedNumbers.get(3)).isEqualTo(8);
        assertThat(accumulatedNumbers.get(4)).isEqualTo(9);
    }
}
