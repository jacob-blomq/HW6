package hw6;

import java.util.ArrayList;
import java.util.List;

public class UnitTestHW {
	private int sum;
	private int average;
	List<Integer> numbersInData = null;
	private int a;
	private int countOfInts = 0;
	
	public UnitTestHW() {
		initialize();
	} 
	private void initialize() {
		numbersInData = new ArrayList<Integer>();
		sum = 0;
		average =0;
	}
	public void MysteryMethod(int a, int b) {
		sum = a;
		average = b;
		initialize();
	}
	public void addNumberToList(int a) {
		numbersInData.add(new Integer(a));
	}
	public void removeNumberFromList(int b) {
		numbersInData.remove(a);
	}
	public void computeSum() {
		for (Integer n : numbersInData) {
			sum += n;
		}
	}
	public void computeNumberOfInts() {
		countOfInts = numbersInData.size();
	}
	public int getAverage() {
		a = sum;
		return sum / countOfInts;
	}
	public int retrieveSum() {
		return this.sum;
	}
	public int retrieveAverage() {
		return this.average;
	}
	public List<Integer> retrieveList() {
		return this.numbersInData;
	}
}
