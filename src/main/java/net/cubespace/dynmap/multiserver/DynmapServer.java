package net.cubespace.dynmap.multiserver;

import net.cubespace.dynmap.multiserver.GSON.*;
import net.cubespace.dynmap.multiserver.util.AbstractFile;

import java.io.IOException;
import java.util.Collection;

public interface DynmapServer {
    Collection<DynmapWorld> getWorlds();

    DynmapWorldConfig getWorldConfig(String name);

    DynmapConfig getDynmapConfig();

    Collection<Component> getComponents();

    Collection<Player> getPlayers();

    AbstractFile getAsInputStream(String path) throws IOException;
}
