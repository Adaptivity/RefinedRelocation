package com.dynious.refinedrelocation.client.gui;

import java.util.List;

public interface IGuiWidgetBase extends IGuiParent
{
    public IGuiParent getParent();

    public void setParent(IGuiParent parent);

    public int getWidth();

    public int getHeight();

    void setSize(int w, int h);

    int getX();

    int getY();

    void setPos(int x, int y);

    void moveX(int amount);

    void moveY(int amount);

    boolean isVisible();

    void setVisible(boolean visible);

    public List<String> getTooltip(int mouseX, int mouseY);

    public void drawForeground(int mouseX, int mouseY);

    public void drawBackground(int mouseX, int mouseY);

    public void draw(int mouseX, int mouseY);

    public void mouseClicked(int mouseX, int mouseY, int type, boolean isShiftKeyDown);

    public boolean keyTyped(char c, int i);

    public void handleMouseInput();

    public void update();

    public void mouseMovedOrUp(int par1, int par2, int par3);
}
