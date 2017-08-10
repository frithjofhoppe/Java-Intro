package junit;

import java.util.List;

public class NumUtilImpl implements NumUtil {

	@Override
	public Integer max(Integer... values) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer min(Integer... values) throws IllegalArgumentException,NullPointerException {

		if (values != null) {

			if (values.length >= 2 && values.length <= 12) {
				int min = Integer.MAX_VALUE;

				for (int i : values) {
					if (i < min) {
						min = i;
					}
				}
			} else {
				throw new IllegalArgumentException("Anzahl der Parameter sind nicht korrekt");
			}
		} else {
			throw new NullPointerException("NullPointer-Fehler");
		}

		return null;
	}

	@Override
	public Double sum(List<Integer> values) throws IllegalArgumentException, NullPointerException {

		double result = 0;

		if (values != null) {
			if (values.size() >= 1 && values.size() <= 100) {
				for (int d : values) {
					result += (double) d;
				}

				return result;
			} else {
				throw new IllegalArgumentException(
						"Die Anzahl der Paramenter liegt nicht innerhalb des vorgegebenen Bereiches");
			}
		} else {
			throw new NullPointerException("NullPointerException");
		}
	}

	@Override
	public Double avg(List<Integer> values) throws IllegalArgumentException, NullPointerException {

		double back = 0;

		if (values != null) {

			if (values.size() >= 2 && values.size() <= 25) {

				for (int i : values) {
					back += (double) i;
				}

				back /= (double) values.size();

			} else {
				throw new IllegalArgumentException("Die Anzahl der Parameter sind nicht konform");
			}
		} else {
			throw new NullPointerException("NullPointer Aufgetreten");
		}

		return null;
	}

}
