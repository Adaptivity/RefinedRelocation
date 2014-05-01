package com.dynious.refinedrelocation.network.packet;

import com.dynious.refinedrelocation.gui.container.IContainerFiltered;
import com.dynious.refinedrelocation.network.PacketTypeHandler;
import cpw.mods.fml.common.network.Player;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.network.INetworkManager;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class PacketPriority extends CustomPacket
{
    int priority;

    public PacketPriority()
    {
        super(PacketTypeHandler.PRIORITY, false);
    }

    public PacketPriority(int priority)
    {
        super(PacketTypeHandler.PRIORITY, false);
        this.priority = priority;
    }

    @Override
    public void writeData(DataOutputStream data) throws IOException
    {
        super.writeData(data);
        data.writeByte(priority);
    }

    @Override
    public void readData(DataInputStream data) throws IOException
    {
        super.readData(data);
        priority = data.readByte();
    }

    @Override
    public void execute(INetworkManager manager, Player player)
    {
        super.execute(manager, player);

        Container container = ((EntityPlayer) player).openContainer;

        if (container == null || !(container instanceof IContainerFiltered))
            return;

        ((IContainerFiltered) container).setPriority(priority);
    }
}
