package _03_if_else_1_unbirthday;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[]args) {
		String f = JOptionPane.showInputDialog(null,"What is your birthday month number?");
		String g = JOptionPane.showInputDialog(null, "What is your birthday day of the month number?");
		int bdayMonth = Integer.parseInt(f);
		int bdayDay = Integer.parseInt(g);
		LocalDate r = LocalDate.now();
		int month = r.getMonthValue();
		int day = r.getDayOfMonth();
		if(bdayMonth == month) {
			if(bdayDay == day) {
				JOptionPane.showMessageDialog(null, "Happy Birthday!!!");

			}
			else {
				JOptionPane.showMessageDialog(null,"Very Merry UNbirthday!!!");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Very Merry UNbirthday!!!");
		}
	}
}
