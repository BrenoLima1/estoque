package entities;

public class Room {

	private int number;
	private boolean isBusy;
	private Student occupant;
	
	public Room(int number) {
		this.number = number;
		this.isBusy = false;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean getIsBusy() {
		return isBusy;
	}

	public void setIsBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}

	public Student getOccupant() {
		return occupant;
	}

	public void setOccupant(Student occupant) {
		this.occupant = occupant;
	}

	@Override
	public String toString() {
		return number + ": " + occupant.getName() + " " + occupant.getEmail() ;
	}

	
}
