/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author santi
 */
public class AleatorisOrdenats {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		//int qtyNumbers = Integer.parseInt(args[0]);
		//String outputType = args[1];
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(3);
		numList.add(2);
		System.out.println("HEY 1");
		/*try {
			aleatorisOrden(numList);
		} catch (Exception ex) {
			Logger.getLogger(AleatorisOrdenats.class.getName()).log(Level.SEVERE, null, ex);
		}*/
		System.out.println("HEY 2");
	}

	public static void aleatorisOrden(ArrayList<Integer> numList) throws Exception {
		Process p = Runtime.getRuntime().exec("java -cp Processos2_Santiago_Correa.jar procesos.P2 " + numList.size());
		OutputStream stdin = p.getOutputStream();
		InputStream stdout = p.getInputStream();

		BufferedReader reader = new BufferedReader(new InputStreamReader(stdout));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stdin));

		for (int i : numList) {
			writer.write(i);
		}
		writer.flush();
		String lane;
		while ((lane = reader.readLine()) != null) {
			System.out.println(lane);
		}
	}
}
