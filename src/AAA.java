
import java.util.Timer;
import java.util.TimerTask;

// extend from thread
public class AAA extends Thread {

	private static class UpdaterThread extends Thread {
		private final int TIMEOUT = 3000;

		// method
		public void run() {
			// try and catch
			while (true) {
				try {
					Timer t = new Timer();
					t.schedule(new TimerTask() {

						@Override
						public void run() {
							// TODO Auto-generated method stub
							System.out.println("3 seconds passed");
						}
					}, TIMEOUT);
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		}
	}

	/**
	 *  args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			Thread u = new UpdaterThread();
			u.start();
			while (true) {
				System.out.println("--");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}