package net.spideynn.javatutorial.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/** Saves data files.
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
public class SaveData {

    public static synchronized void savedata(String data) throws IOException {
        String savedir = System.getProperty("user.home") + "/.javatutorial/savedata";
        BufferedWriter out = new BufferedWriter(new FileWriter(savedir), 32768);
        out.close();
    }

}
