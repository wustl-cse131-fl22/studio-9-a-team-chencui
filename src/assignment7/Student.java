package assignment7;

public class Student {

	private String firstName;
	private String lastName;
	private int id;
	private int attemptedCredits;
	private int passingCredits;
	private double totalQualityPoints;
	private double bearBucks;

	/**
	 * constructs the variables and sets up the variables
	 * 
	 * @param first - gets the first name
	 * @param last - gets the last name
	 * @param idCode - gets the ID code
	 */
	public Student(String first, String last, int idCode) {
		firstName = first;
		lastName = last;
		id = idCode;
	}
	/**
	 * establishes the full name
	 * 
	 * @return expected full name
	 */
	public String getFullName() {
		String expected = firstName + " " + lastName;
		return expected;
	}

	/**
	 * establishes the id
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * establishes the info for attempted and passing credits w quality points
	 * 
	 * @param grade - initial grade
	 * @param credits - initial credit
	 */
	public void submitGrade(double grade, int credits) {
		attemptedCredits += credits;
		if (grade >= 1.7) {
			passingCredits += credits;
		}
		totalQualityPoints += grade * credits;
	}

	/**
	 * establishes totalattemptedcredits
	 * 
	 * @return attempted credits
	 */
	public int getTotalAttemptedCredits() {
		return attemptedCredits;
	}
	/**
	 * establishes totalpassingcredits
	 * 
	 * @return passing credits
	 */
	public int getTotalPassingCredits() {
		return passingCredits;
	}
	/**
	 * establishes GPA
	 * 
	 * @return GPA
	 */
	public double calculateGradePointAverage() {
		return totalQualityPoints / attemptedCredits;
	}

	/**
	 * establishes the year of student
	 * 
	 * @return the year in string form
	 */
	public String getClassStanding() {
		if (passingCredits < 30) {
			return "First Year";
		} else if (passingCredits >= 30 && passingCredits < 60) {
			return "Sophomore";
		} else if (passingCredits >= 60 && passingCredits < 90) {
			return "Junior";
		} else {
			return "Senior";
		}
	}
	/**
	 * establishes whether the student is eligible for frat
	 * 
	 * @return true or false
	 */
	public boolean isEligibleForPhiBetaKappa() {
		if (passingCredits >= 98 && (totalQualityPoints / attemptedCredits) >= 3.60) {
			return true;
		} else if (passingCredits >= 75 && (totalQualityPoints / attemptedCredits) >= 3.80) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * establishes the bearbucks deposit
	 * 
	 * @return amount
	 */
	public void depositBearBucks(double amount) {
		bearBucks += amount;
	}
	/**
	 * establishes the updated bearbucks deposit
	 * 
	 * @return amount
	 */
	public void deductBearBucks(double amount) {
		bearBucks -= amount;
	}
	/**
	 * establishes bearbucks
	 * 
	 * @return amount
	 */
	public double getBearBucksBalance() {
		return bearBucks;
	}
	/**
	 * establishes the updated bearbucks
	 * 
	 * @return amount
	 */
	public double cashOutBearBucks() {
		if (bearBucks <= 10.00 && bearBucks >= 0) {
			bearBucks = bearBucks - bearBucks;
			return bearBucks;
		} else {
			double x = bearBucks - 10;
			bearBucks = bearBucks - bearBucks;
			return x;
		}
	}
	/**
	 * establishes the legacy
	 * 
	 *@param first name
	 * @param other (parent)
	 * @param isHyphenated
	 * @param id
	 * 
	 * @return updated legacy student
	 */
	public Student createLegacy(String firstName, Student other, boolean isHyphenated, int id) {
		String lastName;
		if (isHyphenated == true) {
			lastName = this.lastName + "-" + other.lastName;
		} else {
			lastName = this.lastName;
		}
		Student x = new Student(firstName, lastName, id);
		x.depositBearBucks(other.cashOutBearBucks() + this.cashOutBearBucks());
		return x;
	}
	/**
	 * establishes student w id
	 * 
	 * @return student w id
	 */
	public String toString() {
		return getFullName() + id;
	}

}