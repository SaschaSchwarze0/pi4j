package com.pi4j.system.impl;

/*
 * #%L
 * **********************************************************************
 * ORGANIZATION  :  Pi4J
 * PROJECT       :  Pi4J :: Java Library (Core)
 * FILENAME      :  OdroidSystemInfoProvider.java
 *
 * This file is part of the Pi4J project. More information about
 * this project can be found here:  https://www.pi4j.com/
 * **********************************************************************
 * %%
 * Copyright (C) 2012 - 2021 Pi4J
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import com.pi4j.system.SystemInfo;
import com.pi4j.system.SystemInfoProvider;

import java.io.IOException;

/**
 * Odroid platform specific implementation of the SystemInfoProvider interface.
 */
public class OdroidSystemInfoProvider extends DefaultSystemInfoProvider implements SystemInfoProvider {

//    @Override
//    public String getModelName() throws IOException, InterruptedException, UnsupportedOperationException {
//        return getCpuInfo("Processor");
//    }

    @Override
    public SystemInfo.BoardType getBoardType() throws IOException, InterruptedException, UnsupportedOperationException {
        return SystemInfo.BoardType.Odroid;
    }

//    @Override
//    public float getCpuTemperature() throws IOException, InterruptedException, NumberFormatException, UnsupportedOperationException {
//        try(BufferedReader br = new BufferedReader(new FileReader("/sys/devices/platform/sunxi-i2c.0/i2c-0/0-0034/temp1_input"))) {
//            for(String line; (line = br.readLine()) != null; ) {
//                return Float.parseFloat(line) / 1000;
//            }
//        }
//        throw new UnsupportedOperationException();
//    }

}
