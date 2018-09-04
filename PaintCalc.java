import cs1.Keyboard;

public class PaintCalc
{
	public static void main(String[] args)
	{
		int length, width, height, numdoors, numwindows, windowarea, doorarea, surfacearea, totalarea;

		System.out.print("Width?: ");
		width = Keyboard.readInt();
		System.out.print("Length?: ");
		length = Keyboard.readInt();
		System.out.print("Height?: ");
		height = Keyboard.readInt();

		System.out.print("Number of windows?: ");
		numwindows = Keyboard.readInt();
		windowarea = numwindows * 12;

		System.out.print("Number of doors?: ");
		numdoors = Keyboard.readInt();
		doorarea = numdoors * 21;

		totalarea = length * height * 2 + width * height * 2;
		surfacearea = totalarea - (doorarea + windowarea);
		System.out.print("Total square feet: " + surfacearea + " feet. ");


	}
}