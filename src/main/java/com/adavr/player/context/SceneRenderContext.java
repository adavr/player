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

import org.saintandreas.math.Matrix4f;

/**
 *
 * @author Shotaro Uchida <fantom@xmaker.mx>
 */
public interface SceneRenderContext extends RenderContext {
	
	public void addContext(RenderContext context);
	
	public void removeContext(RenderContext context);
	
	public void updateMatrix(Matrix4f projectionMatrix, Matrix4f modelViewMatrix);
}
