package java102;

import java.util.ArrayList;

public class Grid<T> {
	private final ArrayList<ArrayList<T>> grid;
	public final int sideLength;
    public static int maxLength = 0; 

	public Grid(int sideLength, T defaultVal) {
		this.sideLength = sideLength;
		this.grid = new ArrayList<ArrayList<T>>(sideLength);
		for (int i = 0; i < sideLength; i++) {
			grid.add(new ArrayList<>(sideLength));
			for (int j = 0; j < sideLength; j++) {
				grid.get(i).add(defaultVal);
			}
        }
        if (sideLength > maxLength) {
            maxLength = sideLength;
        }
	}

	public T get(int row, int col) {
		return grid.get(row).get(col);
	}

	public void set(int row, int col, T val) {
		grid.get(row).set(col, val);
	}

	@Override
	public String toString() {
		String str = "";
		for (ArrayList<T> row : grid) {
			for (T element : row) {
				str += element + " ";
			}
			str += "\n";
		}
		return str;
	}
    static <T> String arrayToString(T[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        return str + arr[arr.length - 1] + "]";
    }
    public ArrayList<T> diagonal() {
        ArrayList<T> diagArrayList = new ArrayList<>(sideLength);
        for (int i = 0; i < sideLength; i++ ) {
            diagArrayList.add(grid.get(i).get(i));
        }
        return diagArrayList;
    }
    public static int maxSideLength() {
        return maxLength;
    }
}