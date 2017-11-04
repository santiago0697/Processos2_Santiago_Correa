/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import main.Util;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author santi
 */
public class P1 {
		
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		switch (args[1]){
			case "p":
				outputScreen(Integer.parseInt(args[0]));
				break;
			case "f":
				outputFile(Integer.parseInt(args[0]));
				break;
		}

	}

	public static void outputScreen(int qtyRandom){
		for (int i = 0; i < qtyRandom; i++) {
			System.out.println(Util.randNum());	
		}
	}

	public static void outputFile(int qtyRandom){
		File outputFile = new File("aleatoris.txt");
		FileWriter file = null;
		try {
			file  = new FileWriter(outputFile);
		} catch (IOException ex) {
			Logger.getLogger(P1.class.getName()).log(Level.SEVERE, null, ex);
		}
		if (file != null){
			for (int i = 0; i < qtyRandom; i++) {
				try {	
					file.write(Util.randNum() + "\n");
				} catch (IOException ex) {
					Logger.getLogger(P1.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
			System.out.println(qtyRandom + " Lanes written");
			try {
				file.close();
			} catch (IOException ex) {
				Logger.getLogger(P1.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
}
