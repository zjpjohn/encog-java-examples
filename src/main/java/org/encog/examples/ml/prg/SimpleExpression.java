package org.encog.examples.ml.prg;

import org.encog.mathutil.EncogFunction;
import org.encog.ml.data.MLDataSet;
import org.encog.util.data.GenerationUtil;

public class SimpleExpression {
	public static void main(String[] args) {
		
		MLDataSet trainingData = GenerationUtil.generateSingleDataRange(new EncogFunction() {

			@Override
			public double fn(double[] x) {
				return (x[0] + 10)/4;
			}

			@Override
			public int size() {
				return 1;
			}
			
		}, 0, 100, 1);
		

		
	}
}
