package TEMLib.block.meta;

import arc.func.Cons;
import arc.struct.ObjectIntMap;
import arc.struct.StringMap;
import mindustry.type.Item;
import mindustry.world.modules.ItemModule;

public class TEItemModule extends ItemModule {
    protected ObjectIntMap<ItemEntry> nbtItems = new ObjectIntMap<>();

    public static class ItemEntry {
        public Item item;
        public StringMap nbt = new StringMap();

        ItemEntry(Item item, Cons<StringMap> nbt){
            this.item = item;
            nbt.get(this.nbt);
        }
    }
}
