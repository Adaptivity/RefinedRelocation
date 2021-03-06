package com.dynious.refinedrelocation.container;

public interface IContainerFiltered
{
    public void setUserFilter(String filter);

    public void setBlackList(boolean value);

    public void setFilterOption(int filterIndex, boolean value);

    public void toggleFilterOption(int filterIndex);

    public void setPriority(int priority);
}
