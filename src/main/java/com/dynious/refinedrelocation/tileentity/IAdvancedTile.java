package com.dynious.refinedrelocation.tileentity;

public interface IAdvancedTile
{
    public byte[] getInsertDirection();

    public void setInsertDirection(int from, int value);

    public byte getMaxStackSize();

    public void setMaxStackSize(byte maxStackSize);

    public boolean getSpreadItems();

    public void setSpreadItems(boolean spreadItems);
}
