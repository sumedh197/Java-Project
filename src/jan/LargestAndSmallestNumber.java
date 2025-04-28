package jan;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {

		int num[] = { 10, 20, 5, 30, 40, 50 };

		int largest = num[0];

		int smallest = num[0];

		for (int i = 0; i <= num.length - 1; i++) {

			if (num[i] > largest) {

				largest = num[i];

			} else if (num[i] < smallest) {
				smallest = num[i];

			}

		}

		System.out.println(largest);
		System.out.println(smallest);

	}

}
