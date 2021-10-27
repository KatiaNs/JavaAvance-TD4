package fr.dauphine.javaavance.td3;

public class Cell<T> {
	private Object obj;
	private Cell<T> nextCell;

	public Cell(Object obj) {
		this.obj = obj; 
	}

	public Cell(Object obj, Cell<T> nextCell) {
		this.obj = obj;
		this.nextCell = nextCell;
	}


	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return this.obj;
	}

	public void setNextCell(Cell<T> nextCell) {

		this.nextCell = nextCell;
	}

	public Cell<T> getNextCell() {
		return this.nextCell;
	}


}
