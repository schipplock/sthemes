/*
 * Copyright 2022 Andreas Schipplock
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.schipplock.gui.swing.themes;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;

public class BlindedTheme extends DefaultMetalTheme {

    public static final String NAME = "Metal Blinded";

    @Override
    public String getName() {
        return NAME;
    }

    private final ColorUIResource primary1 = new ColorUIResource(239, 239, 239);

    private final ColorUIResource primary2 = new ColorUIResource(231, 231, 231);

    private final ColorUIResource primary3 = new ColorUIResource(232, 232, 232);

    private final ColorUIResource secondary1 = new ColorUIResource(241, 241, 241);

    private final ColorUIResource secondary2 = new ColorUIResource(245, 245, 245);

    private final ColorUIResource secondary3 = new ColorUIResource(255, 255, 255);

    private final ColorUIResource black = new ColorUIResource(166, 166, 166);

    private final ColorUIResource white = new ColorUIResource(255, 255, 255);

    @Override
    protected ColorUIResource getPrimary1() {
        return primary1;
    }

    @Override
    protected ColorUIResource getPrimary2() {
        return primary2;

    }

    @Override
    protected ColorUIResource getPrimary3() {
        return primary3;
    }

    @Override
    protected ColorUIResource getSecondary1() {
        return secondary1;
    }

    @Override
    protected ColorUIResource getSecondary2() {
        return secondary2;
    }

    @Override
    protected ColorUIResource getSecondary3() {
        return secondary3;
    }

    @Override
    protected ColorUIResource getBlack() {
        return black;
    }

    @Override
    protected ColorUIResource getWhite() {
        return white;
    }
}
