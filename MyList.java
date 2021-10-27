package fr.dauphine.javaavance.td3;

public class MyList<T> {
	private Cell<T> cellHeader;
	private Cell<T> currentCell;
	private int count = 0;


	public MyList() {
		//cellHeader = new Cell("", cellHeader);
		//cellHeader = new Cell("");
	}

	public void add(Object obj) {

		Cell<T> newCell = new Cell<T>(obj);

		if(obj == null) {
			throw new NullPointerException("obj cannot be a null value");
		}


		newCell.setNextCell(cellHeader);
		cellHeader = newCell;
		this.count++;


	}

	public int size() {
		currentCell = cellHeader;
		int count = 0;
		while(currentCell != null) {
			count++;
			currentCell = currentCell.getNextCell();
		}

		return count;

	}

	public String toString() {
		Cell<T> currentCell = cellHeader;
		String displayElt = "";

		while(currentCell != null) {
			displayElt += currentCell.getObj() + ", ";
			currentCell = currentCell.getNextCell();
		}
		displayElt = displayElt.substring(0, displayElt.length() -2);
		return displayElt;
	}


	public void addLast(Object obj) {
		Cell<T> newCell = new Cell<T>(obj);
		//newCell.setNextCell(null);
		if(obj == null) {
			throw new NullPointerException("obj cannot be a null value");
		}
		if(cellHeader == null) {
			cellHeader = newCell;
			this.count++;
		}

		else {
			Cell<T> tempCell = cellHeader;

			while(tempCell != null) {

				tempCell = tempCell.getNextCell();
				if(tempCell.getNextCell() == null) {

					tempCell.setNextCell(newCell);
					//temp = newCell;
					break;

				}

			}
			this.count++;
		}
	}


	public void add(Object obj, int i) {
		Cell<T> newCell = new Cell<T>(obj);
		if(obj == null) {
			throw new NullPointerException("obj cannot be a null value");
		}
		if(cellHeader == null) {
			cellHeader = newCell;
			this.count++;
		}

		else {
			this.count++;
			Cell<T> tempCell = cellHeader;

			for(int j=0; j<this.count; j++) {

				if(j == i) {
					tempCell = newCell;
					tempCell.setNextCell(newCell);

				}
				tempCell = tempCell.getNextCell();
			}
		}
	}


	public T get(int index) {
		if(index > this.count || index < 0) {
			throw new IllegalArgumentException("Out of bound");
		}
		else {
			Cell<T> tempCell = cellHeader;
			String returnVal = "";

			for(int i=0; i<this.count; i++) {

				if(i == index) {
					returnVal = (String) (tempCell.getObj());

					//System.out.println(tempCell);
				}
				tempCell = tempCell.getNextCell();
			}
			return (T) returnVal;
		}

	}


	public int sumLetters() {
		Cell<T> tempCell = cellHeader;
		int sum = 0;
		String strElt = "";

		for(int i=0; i< this.count; i++) {
			strElt = (String) (tempCell.getObj());
			sum += strElt.length();

			tempCell = tempCell.getNextCell();
		}

		return sum;
	}


	public boolean contains(Object obj) {
		Cell<T> tempCell = cellHeader;

		for(int i=0; i< this.count; i++) {
			if(tempCell.getObj().equals(obj)) {
				return true;
			}
			tempCell = tempCell.getNextCell();
		}

		return false;
	}

}
