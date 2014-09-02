package net.spideynn.javatutorial.main;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

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


@Sources({"file:~/.javatutorial/javatutorial.cfg"})
public interface Save extends Config {

    @DefaultValue("**DO NOT CHANGE THE VERSION NUMBER! IT COULD CAUSE INCOMPATABILITY ISSUES WITH NEWER VERSIONS!**")
    String warning();

    @DefaultValue("0.0.1")
    String version();
    
    @DefaultValue("0")
    int timesLaunched();
    
    @DefaultValue("false")
    boolean part1();

    @DefaultValue("false")
    boolean part2();

    @DefaultValue("false")
    boolean part3();

    @DefaultValue("false")
    boolean part4();

    @DefaultValue("false")
    boolean part5();

}
