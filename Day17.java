import java.util.*;
import java.io.*;

class Calculator {
	int power(int n, int p) throws Exception {
		if(n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}
		int toReturn = (int)Math.pow(n, p);
		return toReturn;
	}
}