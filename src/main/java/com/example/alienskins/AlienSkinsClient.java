package com.example.alienskins;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.core.ClientAsset;
import net.minecraft.resources.Identifier;

public class AlienSkinsClient implements ClientModInitializer {
    // id is the logical name; the second argument is the actual file path in the jar
    public static final ClientAsset.ResourceTexture ALIEN_SKIN = new ClientAsset.ResourceTexture(
            Identifier.fromNamespaceAndPath("alienskins", "entity/alien"),
            Identifier.fromNamespaceAndPath("alienskins", "textures/entity/alien.png")
    );

    @Override
    public void onInitializeClient() {
        // Nothing else needed: the mixin swaps the skin for every player.
    }
}
