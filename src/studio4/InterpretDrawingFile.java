package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		
		StdDraw.clear();
		if ("ellipse".equals(shape)) {
			int red = in.nextInt();
			int green = in.nextInt(); 
			int blue = in.nextInt();
			StdDraw.setPenColor(red, green, blue);
			boolean isfilled = in.nextBoolean(); 
			if (isfilled == true) {
				double x = in.nextDouble();
				double y = in.nextDouble();
				double halfw = in.nextDouble();
				double halfh = in.nextDouble();
				StdDraw.filledEllipse(x, y, halfw, halfh);
		
			}
			if(isfilled == false) {	
				double x = in.nextDouble();
				double y = in.nextDouble();
				double halfw = in.nextDouble();
				double halfh = in.nextDouble();
				StdDraw.ellipse(x, y, halfw, halfh);
			}
		
		
	}
}}
