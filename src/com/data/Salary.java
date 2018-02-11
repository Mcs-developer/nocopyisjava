/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data;

/**
 *
 * @author lab.informtica12
 */
public class Salary extends Employee {
	private int hours;
	private float vhr;

	public Salary(String id, String name, String cellphone) {
		super(id, name, cellphone);
	}

	public Salary(String id, String name, String cellphone, int hours, float vhr) {
		super(id, name, cellphone);
		this.hours = hours;
		this.vhr = vhr;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @return the vhr
	 */
	public float getVhr() {
		return vhr;
	}

	public float calculateSalary() {
		return this.hours * this.vhr;
	}
}
