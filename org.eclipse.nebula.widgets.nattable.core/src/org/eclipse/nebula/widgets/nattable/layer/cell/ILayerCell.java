package org.eclipse.nebula.widgets.nattable.layer.cell;

import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.layer.LabelStack;
import org.eclipse.swt.graphics.Rectangle;

public interface ILayerCell {

	public void updateLayer(ILayer layer);
	public void updatePosition(ILayer layer, int originColumnPosition, int originRowPosition, int columnPosition, int rowPosition);
	public void updateColumnSpan(int columnSpan);
	public void updateRowSpan(int rowSpan);
	public ILayer getSourceLayer();	
	public int getOriginColumnPosition();	
	public int getOriginRowPosition();	
	public ILayer getLayer();	
	public int getColumnPosition();	
	public int getRowPosition();
	public int getColumnIndex();
	public int getRowIndex();	
	public int getColumnSpan();	
	public int getRowSpan();	
	public boolean isSpannedCell();
	public String getDisplayMode();
	public LabelStack getConfigLabels();
	public Object getDataValue();
	public Rectangle getBounds();
	
}
