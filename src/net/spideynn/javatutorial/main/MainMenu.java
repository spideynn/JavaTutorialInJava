package net.spideynn.javatutorial.main;

import javax.swing.*;

import org.aeonbits.owner.ConfigFactory;

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
    /**
	 * 
	 */
	private static final long serialVersionUID = -2062146762993313927L;
	private JButton tutorialsButton;
    private JButton javaEditorButton;
    private JButton optionsButton;
    private JButton quitButton;
    static Save save;


    public MainMenu() {
        super("Java Tutorial");
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                //TODO Setup save system to save progress. (see OWNER API)
            	//save.timesLaunched() + 1;
            }
        });
    }
}
