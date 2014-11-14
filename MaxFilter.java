/**
 * MaxFilter extends ComparableFilter, setting the compare function
 * such that if the current input is greater than the previous (via
 * compareTo() function), it sets the output to the current input.
 * @author gmh73
 *
 * @param <T>
 */
public class MaxFilter<T extends Comparable<T>> extends ComparableFilter<T>{
	
	@Override
	protected boolean compare(T input) {
		return 0 <= input.compareTo(getPrevOutput());
	}

}
