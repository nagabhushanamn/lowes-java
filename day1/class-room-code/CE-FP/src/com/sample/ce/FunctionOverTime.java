package com.sample.ce;

//@FunctionalInterface
public interface FunctionOverTime {

	double valueAt(int time);

	// function ==> pure
	static FunctionOverTime monthByMoth(final double[] values) {
		return (time) -> values[time - 1];
	}

	static FunctionOverTime fixed(double value) {
		return polnomial(new double[] { value });
	}

	static FunctionOverTime line(double value, double slope) {
		return polnomial(new double[] { value, slope });
	}

	// -----------------------------------------------------

	static FunctionOverTime polnomial(double[] values) {
		return (time) -> {
			double value = 0.0;
			for (int i = 0; i < values.length; i++) {
				value += values[i] * Math.pow(time, i);
			}
			return value;
		};
	}
	
	// -----------------------------------------------------
	

    @FunctionalInterface
    public static interface FunctionOf3 {
        public double apply(double a, double b, double c);
    }
    
    static FunctionOverTime combinationOf3(
    		    final FunctionOverTime a,
            final FunctionOverTime b,
            final FunctionOverTime c,
            final FunctionOf3 combination) {
    		    
    	        return (time) -> combination.apply(a.valueAt(time),
								              b.valueAt(time),
								              c.valueAt(time));
								}
	
	

}
