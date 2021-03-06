/*
 * Copyright (C) 2015 Shotaro Uchida <fantom@xmaker.mx>
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
package com.adavr.player.context;

import com.adavr.player.globjects.Texture;
import java.io.IOException;
import java.io.InputStream;
import org.lwjgl.opengl.GL13;

/**
 *
 * @author Shotaro Uchida <fantom@xmaker.mx>
 */
public class LogoContext extends QuadContext {

	private static final String LOGO = "logo.png";

	private Texture texture;

	public LogoContext(float width, float height) {
		super(width, height);
	}

	@Override
	public void setup() {
		super.setup();
		try (InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream(LOGO)) {
			Texture.Image image = Texture.loadPNG(is);
			texture = Texture.create(image);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void loop() {
		GL13.glActiveTexture(GL13.GL_TEXTURE0);
		Texture.bind(texture);
		super.loop();
	}

	@Override
	public void destroy() {
		texture.destroy();
		super.destroy();
	}
}