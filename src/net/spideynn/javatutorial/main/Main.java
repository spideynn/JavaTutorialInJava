package net.spideynn.javatutorial.main;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

/**
 * Main class for launching the application
 *
 * Copyright (C) 2014 Spideynn
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class Main {

    public static String[] progress;
    public static Logger log;

    private static void setupMainWindow() {
        //TODO: Create Debug Start Timer.
        JFrame frame = new JFrame("Java Tutorial in Java");
        log.fine("Created JFrame");
        frame.setSize(512, 512);
        JButton button1 = new JButton("Tutorials");
        JButton button2 = new JButton("Java Editor");
        JButton button3 = new JButton("Preferences");
        log.fine("Created Main Menu Buttons");
        button1.setSize(32, 16);
        button2.setSize(16, 32);
        button3.setSize(32, 16);
        log.fine("Set Button Sizes");
        frame.add(button1).setLocation(128, 512);
        frame.add(button2).setLocation(256, 256);
        frame.add(button3).setLocation(512, 128);
        log.fine("Set Button Location");


        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                try {
                    SaveData.savedata(progress);
                } catch (IOException ex) {
                }
            }
        });

        frame.show();
        log.fine("Showing JFrame.");
     }

    public static void main(String[] args) {
        if (args.equals("debug")) {
            Logger.finelogging = true;
        }
        setupMainWindow();
    }


}
