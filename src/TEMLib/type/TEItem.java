package TEMLib.type;

import arc.audio.Sound;
import arc.func.Cons;
import arc.graphics.Color;
import arc.math.Mathf;
import arc.scene.ui.layout.Table;
import arc.struct.Seq;
import arc.util.Nullable;
import mindustry.type.Item;

public class TEItem extends Item {
    public Runnable displayed = () -> {};
    public Seq<Sound> displayedSounds = new Seq<>();
    public Seq<DataModule> dataModules = new Seq<>();

    public @Nullable Cons<Color> textColor = null;

    public TEItem(String name, Color color) {
        super(name, color);
    }

    public TEItem(String name) {
        super(name);
    }

    @Override
    public void displayExtra(Table table) {
        displayed.run();
        if(displayedSounds.any()){
            displayedSounds.get(Mathf.random(displayedSounds.size-1)).play();
        }
    }
}
