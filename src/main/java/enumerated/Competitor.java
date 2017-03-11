package enumerated;

/**
 * @author Dylan.Deng
 * @version 1.00 09-18-2016
 */
public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
}
