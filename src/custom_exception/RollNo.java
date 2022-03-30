package custom_exception;

public class RollNo {

	public static void main(String[] args) {
		try {
			System.out.println(rollNoNotFound(45));
		} catch (RollNoNotFoundException e) {

			e.printStackTrace();
		}

	}

	private static boolean rollNoNotFound(int rollNo) throws RollNoNotFoundException {

		if (rollNo == 46)
			return true;
		else {
			throw new RollNoNotFoundException();
		}
	}

}
