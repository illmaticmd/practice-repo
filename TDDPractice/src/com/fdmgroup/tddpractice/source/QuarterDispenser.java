package com.fdmgroup.tddpractice.source;

public class QuarterDispenser implements Dispensable {

	private Attendant attendant; // has-a relationship

	public QuarterDispenser(Attendant attendant) {

		this.attendant = attendant;
	}

	public QuarterDispenser() {

	}

	public Attendant getAttendant() {
		return attendant;
	}

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	@Override
	public int exchange(Denominations usBanknote) {

		int quarters = 0;

		switch (usBanknote) {
		case ONE:
			quarters = 4;
			break;
		case FIVE:
			quarters = 20;
			break;
		case TEN:
			quarters = 40;
			break;
		}

		return quarters;

		// if (usBanknote == Denominations.ONE) {
		// return 4;
		// }else if (usBanknote == Denominations.FIVE) {
		// return 20;
		// }else if (usBanknote == Denominations.TEN) {
		// return 40;
		// }
		// return 0;
	}

	@Override
	public void refill() {
		attendant.addQuarters();
	}

	@Override
	public void empty() {
		if (this.attendant.getDollars() >= 500) {
			this.attendant.makeDeposit();
		} else if (this.attendant.getDollars() == 0) {
			throw new RuntimeException("We've been robbed!");
		}
	}

}
