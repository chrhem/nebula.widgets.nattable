/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Dirk Fauth <dirk.fauth@googlemail.com> - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.nebula.widgets.nattable.extension.e4.painterfactory;

import java.util.Map;

import org.eclipse.nebula.widgets.nattable.painter.cell.CellPainterWrapper;
import org.eclipse.nebula.widgets.nattable.painter.cell.ICellPainter;

/**
 * Functional interface to create an instance of an {@link CellPainterWrapper}.
 */
@FunctionalInterface
public interface CellPainterWrapperCreator {

    /**
     * Create a {@link CellPainterWrapper} using the given painter properties.
     *
     * @param painterProperties
     *            The painter properties for painter initialization.
     * @param underlying
     *            The {@link ICellPainter} that should be applied as wrapped
     *            painter to the created {@link CellPainterWrapper}.
     * @return An instance of {@link CellPainterWrapper}.
     */
    CellPainterWrapper createCellPainterWrapper(Map<String, Object> painterProperties, ICellPainter underlying);
}
