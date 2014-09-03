package net.spideynn.javatutorial.main;

import javax.swing.*;

import java.awt.BorderLayout;

import net.miginfocom.swing.MigLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Copyright (C) 2014  Spideynn
 * <p/>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class MainMenu extends JFrame {

	private static final long serialVersionUID = -6004776615250042045L;

	public MainMenu() {
        super("Java Tutorial");
        setResizable(false);
        
        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new MigLayout("", "[89px][][][][][][][][][][][][][][][][]", "[23px][][][][][][][][][][][][][][][]"));
        
        JButton btnJavaTutorials = new JButton("Java Tutorials");
        btnJavaTutorials.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        panel.add(btnJavaTutorials, "cell 0 7,alignx left,aligny top");
        
        JButton btnJavaEditor = new JButton("Java Editor");
        btnJavaEditor.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        panel.add(btnJavaEditor, "cell 8 7");
        
        JButton btnOptions = new JButton("Options");
        btnOptions.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        panel.add(btnOptions, "cell 16 7");
        
        JButton btnQuit = new JButton("Quit");
        btnQuit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        panel.add(btnQuit, "cell 8 15");
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                //TODO Setup save system to save progress.
            	//save.timesLaunched() + 1;
            }
        });
    }
}
