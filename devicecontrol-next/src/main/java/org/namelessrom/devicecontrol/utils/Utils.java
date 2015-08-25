/*
 * Copyright (C) 2013 - 2015 Alexander Martinz
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

package org.namelessrom.devicecontrol.utils;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by alex on 25.08.15.
 */
public class Utils {
    @NonNull public static String listAsString(@NonNull List list) {
        if (list.isEmpty()) {
            return "";
        }

        final StringBuilder sb = new StringBuilder();
        for (Object o : list) {
            sb.append(String.valueOf(o)).append(" ");
        }
        return sb.toString().trim();
    }
}
