/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;

/**
 *
 * @author santi
 */
public class Util {
	static final int MIN = 1000;
	static final int MAX = 2000;
	public static int randNum(){
		return (new Random().nextInt(MAX - MIN +1) + MIN);
	}
}
