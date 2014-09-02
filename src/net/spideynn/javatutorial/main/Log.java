package net.spideynn.javatutorial.main;

import javax.swing.*;
import java.awt.*;

/** Custom logger for the Java tutorial.
 *
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
public class Log {

    public static boolean finelogging = false;

    public static synchronized void setupCrashWindow(Exception ex) {
        JFrame frame = new JFrame("Application Crash Detected.");
        JLabel label1 = new JLabel("StackTrace not available.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(label1, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
    public static void fine(String text) {
        if (finelogging = true) {
            System.out.println("[DEBUG] " + text);
        }
    }
    public static void info(String text) {
        System.out.println("[INFO] " + text);
    }

    public static void warning(String text) {
        System.out.println("[WARNING] " + text);
    }

    public static void error(String text, Exception ex) {
        System.out.println("[ERROR] " + text);
        System.out.println("[ERROR] The stacktrace is:");
        System.out.println(ex);
    }

    public static synchronized void crash(Exception ex) {
        setupCrashWindow(ex);
        System.out.println("The application has crashed!");

    }

}
