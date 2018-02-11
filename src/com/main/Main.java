/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import com.data.Salary;

/**
 *
 * @author lab.informtica12
 */
public class Main {

	public static void main(String[] args) {

		Salary emp1;

		String[] options = { "Ingresar Datos" };
		int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Titulo",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		String id = JOptionPane.showInputDialog(null, "Escribe tu numero de identificacion");
		String name = JOptionPane.showInputDialog(null, "Escribe tu nombre");
		String cellphone = JOptionPane.showInputDialog(null, "Escribe tu número de telefono");
		String hours = JOptionPane.showInputDialog(null, "Cuantas horas trabajas?");
		String vhr = JOptionPane.showInputDialog(null, "Cuanto cuesta tu hora?");
		emp1 = new Salary(id, name, cellphone, Integer.parseInt(hours), Float.parseFloat(vhr));
		
		String msg = "";
		msg += "Número de identificación: " + emp1.getId() + "\n";
		msg += "Nombre: " + emp1.getName() + "\n";
		msg += "Celular: " + emp1.getCellphone() + "\n";
		float mySalary = emp1.calculateSalary();
		msg += "Tu sueldo es: " + mySalary;
		
		JOptionPane.showMessageDialog(null, msg);
		
	}
}
