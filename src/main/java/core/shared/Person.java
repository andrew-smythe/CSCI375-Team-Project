package core.shared;

/**
 * Java implementation of a single database generated person.
 */
public class Person {

	/**
	 * This person is a fraud
	 */
	public final boolean fraud;

	/**
	 * 25% chance of this person being a fraud.
	 */
	public final double FRAUD_CHANCE = 0.25;

	/**
	 * Default constructor, randomly assigns a person as a fraud, or not.:w
	 */
	public Person() {
		if (Math.random() < FRAUD_CHANCE) {
			fraud = true;
		} else {
			fraud = false;
		}
	}
}
